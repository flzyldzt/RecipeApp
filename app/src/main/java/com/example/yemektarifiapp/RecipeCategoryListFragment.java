package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecipeCategoryListFragment extends Fragment {
    View view;
    RecyclerView recyclerView;
    TextView tvFoodsLogo;
    ArrayList<RecipeCategoriesListModel> recipeCategoriesListModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recipe_category_list, container, false);
        defineRecipeCategoriesListViews();
        getList();
        setAdapter();
        return view;
    }

    public void defineRecipeCategoriesListViews(){
        recyclerView = view.findViewById(R.id.recyclerView);
        tvFoodsLogo = view.findViewById(R.id.tvFoodsLogo);
    }

    public void getList(){
        recipeCategoriesListModels = new ArrayList<>();
        recipeCategoriesListModels.add(new RecipeCategoriesListModel("Milky Desserts Recipes",R.drawable.milky_desserts));
        recipeCategoriesListModels.add(new RecipeCategoriesListModel("Cake Recipes",R.drawable.cake));
        recipeCategoriesListModels.add(new RecipeCategoriesListModel("Tart Recipes", R.drawable.tart_recipes));
        recipeCategoriesListModels.add(new RecipeCategoriesListModel("Chocolate Recipes", R.drawable.chocolate_recipes));
        recipeCategoriesListModels.add(new RecipeCategoriesListModel("Halva Recipes", R.drawable.halva_recipes));
    }

    public void setAdapter(){
        RecipeCategoriesListAdapter adapter = new RecipeCategoriesListAdapter(recipeCategoriesListModels,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}