package com.example.yemektarifiapp.subcategory.vegetable.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentDetailBinding;
import com.example.yemektarifiapp.databinding.LayoutBottomSheetDialogMaterialBinding;
import com.example.yemektarifiapp.subcategory.vegetable.networking.VegetableTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class VegetableDetailFragment extends Fragment {
    private FragmentDetailBinding binding;
    VegetableTariffResponseModel detail;
    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;

    public static final String VEGETABLE_RECIPE_MODEL_DETAIL_KEY = "vegetableDetail";


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setViewParams();
        onClickMaterial();
        onClickRecipe();
        pullWithGlideVegetables();
    }

    private void initArguments() {
        detail = (VegetableTariffResponseModel) requireArguments().getSerializable(VEGETABLE_RECIPE_MODEL_DETAIL_KEY);
    }


    private void setViewParams() {
        binding.tvDetailCalorie.setText(detail.getCalorie());
        binding.tvDetailPerson.setText(detail.getPerson());
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

        materialBinding.tvMaterialDescription.setText(detail.getMaterials());
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

    public void pullWithGlideVegetables() {
        if (detail.getId().equals("1")) {
            String biberDolmasıImgUrl = "https://i.pinimg.com/originals/e1/21/fc/e121fcdbd373e6edeb6e37b9f6425b48.png";
            Glide.with(this)
                    .load(biberDolmasıImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String yaprakSarmaImgUrl = "https://i.pinimg.com/originals/20/89/bb/2089bba840a7e7d5109168fe1930e646.png";
            Glide.with(this)
                    .load(yaprakSarmaImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String patatesliPatlıcanImgUrl = "https://i.pinimg.com/736x/67/46/a8/6746a838bcee63aca2c354dd287a88e2.jpg";
            Glide.with(this)
                    .load(patatesliPatlıcanImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String tazeFasulyeImgUrl = "https://i.pinimg.com/originals/2f/29/e3/2f29e39b1101360419019d6ea487035a.png";
            Glide.with(this)
                    .load(tazeFasulyeImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String etliBezelyeImgUrl = "https://i.pinimg.com/474x/2a/6d/47/2a6d47a5d65242f02f6cfa21c7d660e3.jpg";
            Glide.with(this)
                    .load(etliBezelyeImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        }
    }
}
