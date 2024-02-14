package com.example.yemektarifiapp.subcategory.salad.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.salad.networking.SaladTariffResponseModel;
import com.example.yemektarifiapp.util.networking.GlideProvider;

import java.util.List;

public class SaladCategoryAdapter extends RecyclerView.Adapter<SaladCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;

    private final List<SaladTariffResponseModel> list;

    private final SaladTariffOnClickInterface saladTariffOnClickInterface;

    public SaladCategoryAdapter(List<SaladTariffResponseModel> categorySubList, SaladTariffOnClickInterface saladTariffOnClickInterface) {
        this.list = categorySubList;
        this.saladTariffOnClickInterface = saladTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new SaladCategoryAdapter.CategoryListHolder(binding, saladTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        SaladTariffResponseModel saladTariffItem = list.get(position);

        GlideProvider glideProvider = new GlideProvider(binding.getRoot().getContext());
        glideProvider.initGlide(saladTariffItem.getImageUrl(), binding.ivSubCategoryPicture);
        binding.tvSubCategoryText.setText(saladTariffItem.getName());
        binding.clCategorySub.setOnClickListener(v -> saladTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, SaladTariffOnClickInterface saladTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}
