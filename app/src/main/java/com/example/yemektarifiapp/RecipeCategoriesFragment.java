package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class RecipeCategoriesFragment extends Fragment {

    View view;
    TextView tvCategoriesLogo;
    private RecyclerView recyclerView;
    ArrayList<RecipeCategoriesModel> recipeCategoriesModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recipe_category, container, false);
        define();
        getList();
        setAdapter();
        return view;
    }

    public void define() {
        recyclerView = view.findViewById(R.id.recyclerView);
        tvCategoriesLogo = view.findViewById(R.id.tvCategories);
    }

    public void getList() {
        //RecipeModel tipinde bır listen olak
        //recıpeModel -- ımage ve rext
        // Recipe model listrını retun edecek

        recipeCategoriesModels = new ArrayList<>();
        recipeCategoriesModels.add(new RecipeCategoriesModel("DESSERTS", R.drawable.dessert_icon));
        recipeCategoriesModels.add(new RecipeCategoriesModel("SOUPS", R.drawable.soup_icon));
        recipeCategoriesModels.add(new RecipeCategoriesModel("SALADS", R.drawable.salad_icon));
        recipeCategoriesModels.add(new RecipeCategoriesModel("LEGUMES", R.drawable.legumes_icon));
        recipeCategoriesModels.add(new RecipeCategoriesModel("VEGETABLES", R.drawable.vegetable_icon));
        recipeCategoriesModels.add(new RecipeCategoriesModel("MEATS", R.drawable.meat_icon));
    }

    public void setAdapter() {
        RecipeCategoriesAdapter adapter = new RecipeCategoriesAdapter(recipeCategoriesModels, getContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}