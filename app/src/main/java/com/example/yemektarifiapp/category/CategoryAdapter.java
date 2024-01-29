package com.example.yemektarifiapp.category;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.ItemCategoryBinding;

import java.util.List;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoriesHolder> {
    private ItemCategoryBinding binding;
    private List<CategoryModel> list;

    private CategoryInterface categoryInterface;

    public CategoryAdapter(List<CategoryModel> list, CategoryInterface categoryInterface) {
        this.list = list;
        this.categoryInterface = categoryInterface;
    }

    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoriesHolder(binding, categoryInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder holder, @SuppressLint("RecyclerView") int position) {
        CategoryModel model = list.get(position);

        binding.tvCategoryText.setText(model.getTitle());
        binding.ivCategoryPictures.setImageResource(model.getImageId());
        binding.clCategory.setOnClickListener(v -> categoryInterface.onItemClick(list.get(position), position));

        //holder.tvCategoryText.setText(model.getTitle());
        //holder.ivCategoryPictures.setImageResource(model.getImageId());
        //holder.clCategory.setOnClickListener(v -> categoryInterface.onItemClick(list.get(position), position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoriesHolder extends RecyclerView.ViewHolder {
        ItemCategoryBinding binding;
        //private TextView tvCategoryText;
        //private ImageView ivCategoryPictures;
        //public ConstraintLayout clCategory;

        public CategoriesHolder(ItemCategoryBinding categoryBinding, CategoryInterface selectCategoriesInterface) {
            super(categoryBinding.getRoot());
            binding = categoryBinding;
            /*tvCategoryText = itemView.findViewById(R.id.tvCategoryText);
            ivCategoryPictures = itemView.findViewById(R.id.ivCategoryPictures);
            clCategory = itemView.findViewById(R.id.clCategory);
        }*/
        }
    }
}
