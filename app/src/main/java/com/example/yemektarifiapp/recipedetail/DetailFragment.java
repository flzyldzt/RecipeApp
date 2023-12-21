package com.example.yemektarifiapp.recipedetail;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yemektarifiapp.R;

public class DetailFragment extends Fragment {

    View view;

    DetailModel detail;

    private ImageView ivSubListPicture;
    private TextView tvSubListRecipe, tvSubListMaterials, tvSubListCalorie, tvSubListPerson;

    public static final String RECIPE_DETAIL_MODEL_KEY = "detail";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detail, container, false);
        initArguments();
        initViews();
        setViewParams();
        return view;
    }

    private void initArguments() {
        detail = (DetailModel) requireArguments().getSerializable(RECIPE_DETAIL_MODEL_KEY);
    }

    public void initViews() {
        ivSubListPicture = view.findViewById(R.id.ivDetailPicture);
        tvSubListRecipe = view.findViewById(R.id.tvDetailRecipe);
        tvSubListMaterials = view.findViewById(R.id.tvDetailMaterial);
        tvSubListCalorie = view.findViewById(R.id.tvDetailCalorie);
        tvSubListPerson = view.findViewById(R.id.tvDetailPerson);
    }

    private void setViewParams() {
        ivSubListPicture.setImageResource(detail.getImageId());
        tvSubListRecipe.setText(detail.getRecipe());
        tvSubListMaterials.setText(detail.getMaterial());
        tvSubListCalorie.setText(detail.getCalorie());
        tvSubListPerson.setText(detail.getPerson());
    }


}