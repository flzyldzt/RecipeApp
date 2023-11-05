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

public class RecipeCategoriesAdapter extends RecyclerView.Adapter<RecipeCategoriesAdapter.CategoriesHolder> {
    private ArrayList<RecipeCategoriesModel> modelArrayList;
    private Context context;

    public RecipeCategoriesAdapter(ArrayList<RecipeCategoriesModel> list, Context context) {
        this.modelArrayList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe_categories, parent, false);
        return new CategoriesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder holder, int position) {
        RecipeCategoriesModel recipeCategoriesModel = modelArrayList.get(position);
        holder.categoriesText.setText(recipeCategoriesModel.getTitle());
        holder.categoriesPicture.setImageResource(recipeCategoriesModel.getImageId());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class CategoriesHolder extends RecyclerView.ViewHolder {
        private TextView categoriesText;
        private ImageView categoriesPicture;

        public CategoriesHolder(@NonNull View itemView) {
            super(itemView);
            categoriesText = itemView.findViewById(R.id.tvRecipeCategoryText);
            categoriesPicture = itemView.findViewById(R.id.ivRecipeCategoryPictures);
        }
    }
}
