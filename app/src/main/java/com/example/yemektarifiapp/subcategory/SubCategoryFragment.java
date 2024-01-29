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

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.recipedetail.DetailFragment;
import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.util.ChangeFragment;

import java.util.ArrayList;

public class SubCategoryFragment extends Fragment implements SubCategoryInterface {

    private FragmentSubCategoryBinding binding;

    ArrayList subList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        initAdapter();
        return binding.getRoot();
    }

    private void initArguments() {
        subList = (ArrayList) requireArguments().getSerializable("list");
    }

    public void initAdapter() {
        if (!subList.isEmpty()) {
            SubCategoryAdapter adapter = new SubCategoryAdapter(subList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
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