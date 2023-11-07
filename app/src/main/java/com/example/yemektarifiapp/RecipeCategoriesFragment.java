package com.example.yemektarifiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecipeCategoriesFragment extends Fragment implements SelectCategoriesInterface {

    View view;
    TextView tvCategoriesLogo;
    private RecyclerView recyclerView;
    ArrayList<RecipeCategoriesModel> recipeCategoriesModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recipe_category, container, false);
        defineRecipeCategoriesViews();
        getList();
        setAdapter();
        return view;
    }

    public void defineRecipeCategoriesViews() {
        recyclerView = view.findViewById(R.id.recyclerView);
        tvCategoriesLogo = view.findViewById(R.id.tvCategories);
    }

    public void getList() {
        //RecipeModel tipinde bır listen olak
        //recıpeModel -- ımage ve rext
        // Recipe model listrını retun edecek

        recipeCategoriesModel = new ArrayList<>();
        recipeCategoriesModel.add(new RecipeCategoriesModel("DESSERTS", R.drawable.dessert_icon));
        recipeCategoriesModel.add(new RecipeCategoriesModel("SOUPS", R.drawable.soup_icon));
        recipeCategoriesModel.add(new RecipeCategoriesModel("SALADS", R.drawable.salad_icon));
        recipeCategoriesModel.add(new RecipeCategoriesModel("LEGUMES", R.drawable.legumes_icon));
        recipeCategoriesModel.add(new RecipeCategoriesModel("VEGETABLES", R.drawable.vegetable_icon));
        recipeCategoriesModel.add(new RecipeCategoriesModel("MEATS", R.drawable.meat_icon));
    }

    public void setAdapter() {
        RecipeCategoriesAdapter adapter = new RecipeCategoriesAdapter(recipeCategoriesModel, getContext(), this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(RecipeCategoriesModel recipeCategoriesModel) {
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(new RecipeCategoryListFragment());
    }

}