package com.example.yemektarifiapp.subcategory.legume.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.legume.networking.LegumeTariffResponseModel;

import java.util.List;

public class LegumeCategoryAdapter extends RecyclerView.Adapter<LegumeCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;
    private final List<LegumeTariffResponseModel> list;
    private final LegumeTariffOnClickInterface legumeTariffOnClickInterface;

    public LegumeCategoryAdapter(List<LegumeTariffResponseModel> list, LegumeTariffOnClickInterface legumeTariffOnClickInterface) {
        this.list = list;
        this.legumeTariffOnClickInterface = legumeTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryListHolder(binding, legumeTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        LegumeTariffResponseModel legumeTariffItem = list.get(position);
        binding.tvSubCategoryText.setText(legumeTariffItem.getName());
        //  binding.ivSubCategoryPicture.setImageURI(Uri.parse(soapTariffItem.getIcon()));  //TODO Glide kullanılacak
        binding.ivSubCategoryPicture.setImageResource(R.drawable.ic_soup);
        binding.clCategorySub.setOnClickListener(v -> legumeTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {

        ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, LegumeTariffOnClickInterface legumeTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}
