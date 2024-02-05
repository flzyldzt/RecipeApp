package com.example.yemektarifiapp.subcategory.soup.detail;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentSubDetailBinding;
import com.example.yemektarifiapp.databinding.LayoutBottomSheetDialogMaterialBinding;
import com.example.yemektarifiapp.subcategory.soup.networking.SoupTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SoupDetailFragment extends Fragment {


    private FragmentSubDetailBinding binding;
    SoupTariffResponseModel detail;

    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;
    public static final String RECIPE_DETAIL_MODEL_KEY = "detail";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setViewParams();
        onClickMaterial();
        onClickRecipe();
    }

    private void initArguments() {
        detail = (SoupTariffResponseModel) requireArguments().getSerializable(RECIPE_DETAIL_MODEL_KEY);
    }


    private void setViewParams() {
        //binding.ivDetailPicture.setImageResource(detail.getIcon());
        binding.ivDetailPicture.setImageResource(R.drawable.ic_soup);
        binding.tvDetailCalorie.setText(detail.getName());
        binding.tvDetailPerson.setText(detail.getRecipe());
    }

    private void onClickMaterial() {
        binding.btnDetailMaterial.setOnClickListener(v -> {
            createDialogMaterialDescription();
        });
    }

    private void onClickRecipe() {
        binding.btnDetailRecipe.setOnClickListener(v -> {
            createDialogRecipeDescription();
        });
    }

    private void createDialogMaterialDescription() {
        LayoutBottomSheetDialogMaterialBinding materialBinding;
        bottomSheetDialogMaterial = new BottomSheetDialog(requireContext());
        materialBinding = LayoutBottomSheetDialogMaterialBinding.inflate(getLayoutInflater());

        //TextView tvMaterialDescription = bottomView.findViewById(R.id.tvMaterialDescription);
        materialBinding.tvMaterialDescription.setText(detail.getMaterials());

        //Button btnClose = bottomView.findViewById(R.id.btnClose);
        materialBinding.btnClose.setOnClickListener(v -> bottomSheetDialogMaterial.dismiss());

        bottomSheetDialogMaterial.setContentView(materialBinding.getRoot());
        bottomSheetDialogMaterial.show();
    }

    private void createDialogRecipeDescription() {
        bottomSheetDialogRecipe = new BottomSheetDialog(requireContext());
        View bottomView = getLayoutInflater().inflate(R.layout.layout_bottom_sheet_dialog_recipe, null, false);

        TextView tvRecipeDescription = bottomView.findViewById(R.id.tvRecipeDescription);
        tvRecipeDescription.setText(detail.getRecipe());

        Button btnClose = bottomView.findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> bottomSheetDialogRecipe.dismiss());

        bottomSheetDialogRecipe.setContentView(bottomView);
        bottomSheetDialogRecipe.show();
    }
}
