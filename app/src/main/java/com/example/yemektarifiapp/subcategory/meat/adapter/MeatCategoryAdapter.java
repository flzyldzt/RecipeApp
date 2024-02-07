package com.example.yemektarifiapp.subcategory.meat.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.meat.networking.MeatTariffResponseModel;

import java.util.List;

public class MeatCategoryAdapter extends RecyclerView.Adapter<MeatCategoryAdapter.CategoryListHolder> {
    private ItemCategorySubBinding binding;
    private final List<MeatTariffResponseModel> list;

    private final MeatTariffOnClickInterface meatTariffOnClickInterface;

    public MeatCategoryAdapter(List<MeatTariffResponseModel> list, MeatTariffOnClickInterface meatTariffOnClickInterface) {
        this.list = list;
        this.meatTariffOnClickInterface = meatTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryListHolder(binding, meatTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        MeatTariffResponseModel meatTariffItem = list.get(position);
        binding.tvSubCategoryText.setText(meatTariffItem.getName());
        //  binding.ivSubCategoryPicture.setImageURI(Uri.parse(soapTariffItem.getIcon()));  //TODO Glide kullanılacak
        binding.ivSubCategoryPicture.setImageResource(R.drawable.ic_soup);
        binding.clCategorySub.setOnClickListener(v -> meatTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, MeatTariffOnClickInterface meatTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}
