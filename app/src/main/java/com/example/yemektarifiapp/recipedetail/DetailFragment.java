package com.example.yemektarifiapp.recipedetail;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yemektarifiapp.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class DetailFragment extends Fragment {

    View view;

    DetailModel detail;

    private ImageView ivSubListPicture;
    private TextView  tvSubListCalorie, tvSubListPerson;
    public Button btnDetailMaterial, btnDetailRecipe;

    public BottomSheetDialog bottomSheetDialog;

    public static final String RECIPE_DETAIL_MODEL_KEY = "detail";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sub_detail, container, false);
        initArguments();
        initViews();
        setViewParams();
        onClick();
        return view;
    }

    private void initArguments() {
        detail = (DetailModel) requireArguments().getSerializable(RECIPE_DETAIL_MODEL_KEY);
    }

    private void initViews() {
        ivSubListPicture = view.findViewById(R.id.ivDetailPicture);
        btnDetailMaterial = view.findViewById(R.id.btnDetailMaterial);
        btnDetailRecipe = view.findViewById(R.id.btnDetailRecipe);
        tvSubListCalorie = view.findViewById(R.id.tvDetailCalorie);
        tvSubListPerson = view.findViewById(R.id.tvDetailPerson);
    }

    private void setViewParams() {
        ivSubListPicture.setImageResource(detail.getImageId());
        //btnDetailMaterial.setText(detail.getRecipe());
        //btnDetailRecipe.setText(detail.getMaterial());
        tvSubListCalorie.setText(detail.getCalorie());
        tvSubListPerson.setText(detail.getPerson());
    }


    private void onClick(){
        btnDetailMaterial.setOnClickListener(v -> {
            createDialog();
        });

    }

    private void createDialog(){
        bottomSheetDialog = new BottomSheetDialog(requireContext());

        View bottomView = getLayoutInflater().inflate(R.layout.layout_bottom_sheet_dialog, null, false);

        TextView tvMaterialDescription = bottomView.findViewById(R.id.tvMaterialDescription);
        tvMaterialDescription.setText("açıklama metni");
        bottomSheetDialog.setContentView(bottomView);
        bottomSheetDialog.show();


    }
}
