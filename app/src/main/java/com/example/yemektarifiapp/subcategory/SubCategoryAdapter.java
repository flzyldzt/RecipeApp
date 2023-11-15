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

import java.util.List;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.CategoryListHolder> {

    private List<SubCategoryModel> list;

    private SubCategoryInterface subCategoryInterface;


    public SubCategoryAdapter(List<SubCategoryModel> categorySubList, SubCategoryInterface subCategoryInterface) {
        this.list = categorySubList;
        this.subCategoryInterface = subCategoryInterface;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category_sub, parent, false);
        return new CategoryListHolder(view, subCategoryInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, @SuppressLint("RecyclerView") int position) {
        SubCategoryModel model = list.get(position);

        holder.tvSubCategoryText.setText(model.getTitle());
        holder.ivSubCategoryPicture.setImageResource(model.getImageId());
        holder.clCategorySub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subCategoryInterface.onItemClick(list.get(position), position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        private TextView tvSubCategoryText;
        private ImageView ivSubCategoryPicture;

        public ConstraintLayout clCategorySub;

        public CategoryListHolder(@NonNull View itemView, SubCategoryInterface subCategoryInterface) {
            super(itemView);
            tvSubCategoryText = itemView.findViewById(R.id.tvSubCategoryText);
            ivSubCategoryPicture = itemView.findViewById(R.id.ivSubCategoryPicture);
            clCategorySub = itemView.findViewById(R.id.clCategorySub);
        }
    }
}
