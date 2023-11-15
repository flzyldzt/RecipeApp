package com.example.yemektarifiapp.subcategory;

import static com.example.yemektarifiapp.recipedetail.DetailFragment.RECIPE_DETAIL_MODEL_KEY;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yemektarifiapp.recipedetail.DetailFragment;
import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.util.ChangeFragment;

import java.util.ArrayList;

public class SubCategoryFragment extends Fragment implements SubCategoryInterface {
    View view;
    RecyclerView recyclerView;
    TextView tvFoodsLogo;
    ArrayList subList;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sub_category, container, false);
        initViews();
        initAdapter();
        return view;
    }

    private void initArguments() {
        subList = (ArrayList) requireArguments().getSerializable("list");
    }

    public void initViews() {
        recyclerView = view.findViewById(R.id.recyclerView);
        tvFoodsLogo = view.findViewById(R.id.tvFoodsLogo);
    }

    public void initAdapter() {
        if (!subList.isEmpty()) {
            SubCategoryAdapter adapter = new SubCategoryAdapter(subList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter);
        }
    }



    /*
    public ArrayList<RecipeCategoriesSubListModel> getList() {

        list = new ArrayList<>();
        DummyListGenerator listGenerator = new DummyListGenerator();

        list.add(new RecipeCategoriesSubListModel(SubCategoryMenuIds.FIRIN_SÜTLAC,"Fırın Sütlaç",R.drawable.firin_sutlac,listGenerator.getDessertList()));
        list.add(new RecipeCategoriesSubListModel(SubCategoryMenuIds.MAGNOLİA,"Magnolia", R.drawable.magnolia, listGenerator.getSoupList()));
        list.add(new RecipeCategoriesSubListModel(SubCategoryMenuIds.ASURE,"Aşure", R.drawable.asure, listGenerator.getSaladList()));
        list.add(new RecipeCategoriesSubListModel(SubCategoryMenuIds.VİSNELİ_CHEESECAKE,"Vişneli Cheesecake", R.drawable.visneli_cheesecake, listGenerator.getLegumeList()));
        list.add(new RecipeCategoriesSubListModel(SubCategoryMenuIds.GÜLLAC,"Güllaç", R.drawable.gullac, listGenerator.getVegetableList()));
        return list;
    }*/



    public void onClick() {

        /*Detail ekranını liste ıcınden tıklanan verının detay bılgılerını göndereeceksın dıger fragment'a*/
    }

    @Override
    public void onItemClick(SubCategoryModel subCategoryModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(RECIPE_DETAIL_MODEL_KEY, subCategoryModel.getDetailModel());

        // Gideceğimiz fragment'ın nesnesini oluşturalım ve onun instance'si ile işlemler yapalım:
        Fragment fragment = new DetailFragment();
        //ilgili fragment'ın argument'ıne gönderecegımız bılgılerı ıceren bundle'ı yerleştiriyoruz.
        fragment.setArguments(bundle);

        // fragment'ı degıstırelım
        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}