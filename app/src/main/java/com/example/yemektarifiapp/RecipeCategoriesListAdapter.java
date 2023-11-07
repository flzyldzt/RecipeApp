package com.example.yemektarifiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeCategoriesListAdapter extends RecyclerView.Adapter<RecipeCategoriesListAdapter.CategoryListHolder> {

    ArrayList<RecipeCategoriesListModel> modelArrayList;
    Context context;

    public RecipeCategoriesListAdapter(ArrayList<RecipeCategoriesListModel> modelArrayList, Context context) {
        this.modelArrayList = modelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe_categories_list, parent, false);
        return new CategoryListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListHolder holder, int position) {
        RecipeCategoriesListModel recipeCategoriesListModel = modelArrayList.get(position);
        holder.categoryListTitle.setText(recipeCategoriesListModel.getTitle());
        holder.categoryListPicture.setImageResource(recipeCategoriesListModel.getImageId());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class CategoryListHolder extends RecyclerView.ViewHolder {
        private TextView categoryListTitle;
        private ImageView categoryListPicture;

        public CategoryListHolder(@NonNull View itemView) {
            super(itemView);
            categoryListTitle = itemView.findViewById(R.id.tvRecipeCategoryListTitle);
            categoryListPicture = itemView.findViewById(R.id.ivRecipeCategoryListPicture);
        }
    }
}
