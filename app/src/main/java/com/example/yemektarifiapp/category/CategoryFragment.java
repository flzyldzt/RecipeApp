package com.example.yemektarifiapp.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentCategoryBinding;
import com.example.yemektarifiapp.subcategory.soup.SoupCategoryFragment;
import com.example.yemektarifiapp.util.ChangeFragment;

import java.util.ArrayList;


public class CategoryFragment extends Fragment implements CategoryInterface {

    private FragmentCategoryBinding binding;

    ArrayList<CategoryMenuModel> modelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCategoryBinding.inflate(inflater, container, false);
        initAdapter();
        return binding.getRoot();
    }

    public void initAdapter() {
        CategoryAdapter adapter = new CategoryAdapter(getCategoryList(), this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        binding.recyclerView.setLayoutManager(gridLayoutManager);
        binding.recyclerView.setAdapter(adapter);
    }

    public ArrayList<CategoryMenuModel> getCategoryList() {
        modelArrayList = new ArrayList<>();

        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.DESERT, "DESSERTS", R.drawable.ic_dessert));
        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.SOUP, "SOUPS", R.drawable.ic_soup));
        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.SALADS, "SALADS", R.drawable.ic_salad));
        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.LEGUMES, "LEGUMES", R.drawable.ic_legume));
        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.VEGETABLES, "VEGETABLES", R.drawable.ic_vegetable));
        modelArrayList.add(new CategoryMenuModel(CategoryMenuIds.MEATS, "MEATS", R.drawable.ic_meat));
        return modelArrayList;
    }

    @Override
    public void onItemClick(CategoryMenuModel recipeCategoriesModel, int position) {
        //Bundle ile fragmentlar arası gönderecegımız veriyi ekliyoruz.
        Bundle bundle = new Bundle();
        // bundle'a eklenecekler burada aklenebılır.

        Fragment fragment;
        // Gideceğimiz fragment'ın nesnesini oluşturalım ve onun instance'si ile işlemler yapalım:
        if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.DESERT) {
            // fragment = DessertFragment();
            fragment = new SoupCategoryFragment();
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.SOUP) {
            fragment = new SoupCategoryFragment();
            fragment.setArguments(bundle); //ilgili fragment'ın argument'ıne gönderecegımız bılgılerı ıceren bundle'ı yerleştiriyoruz.
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.SALADS) {
            fragment = new SoupCategoryFragment();

        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.LEGUMES) {
            fragment = new SoupCategoryFragment();

        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.VEGETABLES) {
            fragment = new SoupCategoryFragment();

        } else {
            fragment = new SoupCategoryFragment();
        }

        // fragment'ı degıstırelım
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}