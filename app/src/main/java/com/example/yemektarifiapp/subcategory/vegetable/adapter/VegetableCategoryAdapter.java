package com.example.yemektarifiapp.subcategory.vegetable.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.vegetable.networking.VegetableTariffResponseModel;

import java.util.List;

public class VegetableCategoryAdapter extends RecyclerView.Adapter<VegetableCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;
    private final List<VegetableTariffResponseModel> list;

    private final VegetableTariffOnClickInterface vegetableTariffOnClickInterface;

    public VegetableCategoryAdapter(List<VegetableTariffResponseModel> categorySubList, VegetableTariffOnClickInterface vegetableTariffOnClickInterface) {
        this.list = categorySubList;
        this.vegetableTariffOnClickInterface = vegetableTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryListHolder(binding, vegetableTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        VegetableTariffResponseModel vegetableTariffItem = list.get(position);
        binding.tvSubCategoryText.setText(vegetableTariffItem.getName());
        //  binding.ivSubCategoryPicture.setImageURI(Uri.parse(soapTariffItem.getIcon()));  //TODO Glide kullanılacak
        binding.ivSubCategoryPicture.setImageResource(R.drawable.ic_soup);
        binding.clCategorySub.setOnClickListener(v -> vegetableTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        private final ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, VegetableTariffOnClickInterface vegetableTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}
