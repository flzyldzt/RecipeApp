package com.example.yemektarifiapp.subcategory.vegetable.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.vegetable.networking.VegetableTariffResponseModel;
import com.example.yemektarifiapp.util.networking.GlideProvider;

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

        GlideProvider glideProvider = new GlideProvider(binding.getRoot().getContext());
        glideProvider.initGlide(vegetableTariffItem.getImageUrl(), binding.ivSubCategoryPicture);
        binding.tvSubCategoryText.setText(vegetableTariffItem.getName());
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
