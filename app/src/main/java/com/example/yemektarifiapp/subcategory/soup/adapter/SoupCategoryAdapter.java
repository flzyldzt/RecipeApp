package com.example.yemektarifiapp.subcategory.soup.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;
import com.example.yemektarifiapp.subcategory.soup.networking.SoupTariffResponseModel;
import com.example.yemektarifiapp.util.networking.GlideProvider;

import java.util.List;

public class SoupCategoryAdapter extends RecyclerView.Adapter<SoupCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;

    private final List<SoupTariffResponseModel> list;

    private final SoupTariffOnClickInterface soupTariffOnClickInterface;

    public SoupCategoryAdapter(List<SoupTariffResponseModel> categorySubList, SoupTariffOnClickInterface soupTariffOnClickInterface) {
        this.list = categorySubList;
        this.soupTariffOnClickInterface = soupTariffOnClickInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoryListHolder(binding, soupTariffOnClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, @SuppressLint("RecyclerView") int position) {
        SoupTariffResponseModel soapTariffItem = list.get(position);

        GlideProvider glideProvider = new GlideProvider(binding.getRoot().getContext());
        glideProvider.initGlide(soapTariffItem.getImageUrl(), binding.ivSubCategoryPicture);
        binding.tvSubCategoryText.setText(soapTariffItem.getName());
        binding.clCategorySub.setOnClickListener(v -> soupTariffOnClickInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        ItemCategorySubBinding binding;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, SoupTariffOnClickInterface soupTariffOnClickInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
        }
    }
}

