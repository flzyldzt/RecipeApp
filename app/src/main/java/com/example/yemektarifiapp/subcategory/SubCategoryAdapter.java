package com.example.yemektarifiapp.subcategory;

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
import com.example.yemektarifiapp.databinding.ItemCategorySubBinding;

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.CategoryListHolder> {

    private ItemCategorySubBinding binding;

    private List<SubCategoryModel> list;

    private SubCategoryInterface subCategoryInterface;


    public SubCategoryAdapter(List<SubCategoryModel> categorySubList, SubCategoryInterface subCategoryInterface) {
        this.list = categorySubList;
        this.subCategoryInterface = subCategoryInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemCategorySubBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category_sub, parent, false);
        return new CategoryListHolder(binding, subCategoryInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, @SuppressLint("RecyclerView") int position) {
        SubCategoryModel model = list.get(position);

        binding.tvSubCategoryText.setText(model.getTitle());
        binding.ivSubCategoryPicture.setImageResource(model.getImageId());
        binding.clCategorySub.setOnClickListener(v -> subCategoryInterface.onItemClick(list.get(position), position));

        /*holder.tvSubCategoryText.setText(model.getTitle());
        holder.ivSubCategoryPicture.setImageResource(model.getImageId());
        holder.clCategorySub.setOnClickListener(v -> subCategoryInterface.onItemClick(list.get(position), position));*/
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        ItemCategorySubBinding binding;
        //private TextView tvSubCategoryText;
        //private ImageView ivSubCategoryPicture;
        //public ConstraintLayout clCategorySub;

        public CategoryListHolder(ItemCategorySubBinding categorySubBinding, SubCategoryInterface subCategoryInterface) {
            super(categorySubBinding.getRoot());
            binding = categorySubBinding;
            /*tvSubCategoryText = itemView.findViewById(R.id.tvSubCategoryText);
            ivSubCategoryPicture = itemView.findViewById(R.id.ivSubCategoryPicture);
            clCategorySub = itemView.findViewById(R.id.clCategorySub);
        }*/
        }
    }
}
