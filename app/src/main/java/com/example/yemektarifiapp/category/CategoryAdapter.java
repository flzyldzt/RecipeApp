package com.example.yemektarifiapp.category;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.databinding.ItemCategoryBinding;

import java.util.List;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoriesHolder> {
    private ItemCategoryBinding binding;
    private final List<CategoryMenuModel> list;

    private final CategoryInterface categoryInterface;

    public CategoryAdapter(List<CategoryMenuModel> list, CategoryInterface categoryInterface) {
        this.list = list;
        this.categoryInterface = categoryInterface;
    }

    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CategoriesHolder(binding, categoryInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder holder, @SuppressLint("RecyclerView") int position) {
        CategoryMenuModel model = list.get(position);

        binding.tvCategoryText.setText(model.getTitle());
        binding.ivCategoryPictures.setImageResource(model.getImageId());
        binding.clCategory.setOnClickListener(v -> categoryInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoriesHolder extends RecyclerView.ViewHolder {
        ItemCategoryBinding binding;

        public CategoriesHolder(ItemCategoryBinding categoryBinding, CategoryInterface selectCategoriesInterface) {
            super(categoryBinding.getRoot());
            binding = categoryBinding;
        }
    }
}
