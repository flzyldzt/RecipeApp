package com.example.yemektarifiapp.category;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.subcategory.SubCategoryFragment;
import com.example.yemektarifiapp.util.DummyListGenerator;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment implements CategoryInterface {

    View view;
    TextView tvCategoriesLogo;
    private RecyclerView recyclerView;
    ArrayList<CategoryModel> modelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category, container, false);
        initViews();
        initAdapter();
        return view;
    }

    public void initViews() {
        recyclerView = view.findViewById(R.id.recyclerView);
        tvCategoriesLogo = view.findViewById(R.id.tvCategories);
    }

    public void initAdapter() {
        CategoryAdapter adapter = new CategoryAdapter(getList(), this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public List<CategoryModel> getList() {
        //RecipeModel tipinde bır listen olak
        //recıpeModel -- ımage ve rext
        // Recipe model listrını retun edecek
        modelArrayList = new ArrayList<>();
        DummyListGenerator listGenerator = new DummyListGenerator();

        modelArrayList.add(new CategoryModel(CategoryMenuIds.DESERT, "DESSERTS", R.drawable.ic_dessert, listGenerator.getDessertList()));
        modelArrayList.add(new CategoryModel(CategoryMenuIds.SOUP, "SOUPS", R.drawable.ic_soup, listGenerator.getSoupList()));
        modelArrayList.add(new CategoryModel(CategoryMenuIds.SALADS, "SALADS", R.drawable.ic_salad, listGenerator.getSaladList()));
        modelArrayList.add(new CategoryModel(CategoryMenuIds.LEGUMES, "LEGUMES", R.drawable.ic_legume, listGenerator.getLegumeList()));
        modelArrayList.add(new CategoryModel(CategoryMenuIds.VEGETABLES, "VEGETABLES", R.drawable.ic_vegetable, listGenerator.getVegetableList()));
        modelArrayList.add(new CategoryModel(CategoryMenuIds.MEATS, "MEATS", R.drawable.ic_meat, listGenerator.getMeatList()));
        return modelArrayList;
    }

    @Override
    public void onItemClick(CategoryModel recipeCategoriesModel, int position) {
        //Bundle ile fragmentlar arası gönderecegımız veriyi ekliyoruz.
        Bundle bundle = new Bundle();

        /*Bundle'a verı ekleyecegız kontroller yapıp şartı sağlayan liste verısını eklıyoruz:
         Adapterda tıklanan ıtem'ın verısıne göre check edıyoruz
        tıklanan item'ın posiiton bilgisini alıp liste içerisinden datalar ile check edıyoruz.*/

        if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.DESERT) {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.SOUP) {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.SALADS) {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.LEGUMES) {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        } else if (recipeCategoriesModel.getMenuId() == CategoryMenuIds.VEGETABLES) {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        } else {
            bundle.putSerializable("list", modelArrayList.get(position).getSubList());
        }


        // Gideceğimiz fragment'ın nesnesini oluşturalım ve onun instance'si ile işlemler yapalım:
        Fragment fragment = new SubCategoryFragment();
        //ilgili fragment'ın argument'ıne gönderecegımız bılgılerı ıceren bundle'ı yerleştiriyoruz.
        fragment.setArguments(bundle);

        // fragment'ı degıstırelım
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}