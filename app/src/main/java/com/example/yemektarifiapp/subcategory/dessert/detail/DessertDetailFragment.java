package com.example.yemektarifiapp.subcategory.dessert.detail;

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
import com.example.yemektarifiapp.subcategory.dessert.networking.DessertTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class DessertDetailFragment extends Fragment {
    private FragmentDetailBinding binding;
    DessertTariffResponseModel detail;
    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;
    public static final String DESSERT_RECIPE_MODEL_DETAIL_KEY = "dessertDetail";


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setViewParams();
        onClickMaterial();
        onClickRecipe();
        pullWithGlideDesserts();
    }

    private void initArguments() {
        detail = (DessertTariffResponseModel) requireArguments().getSerializable(DESSERT_RECIPE_MODEL_DETAIL_KEY);
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

    public void pullWithGlideDesserts() {
        if (detail.getId().equals("1")) {
            String firinSütlacImgUrl = "https://i.pinimg.com/564x/94/03/31/940331b78ad08540b4ced3615c0d6b38.jpg";
            Glide.with(this)
                    .load(firinSütlacImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String magnoliaImgUrl = "https://www.kayaciftligi.com.tr/wp-content/uploads/Artboard-1.png";
            Glide.with(this)
                    .load(magnoliaImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String asureImgUrl = "https://i.pinimg.com/736x/86/c0/17/86c01732cbcc9fa4113042aaf743a001.jpg";
            Glide.with(this)
                    .load(asureImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String cheesecakeImgUrl = "https://i.pinimg.com/736x/32/c5/a9/32c5a969ab5c314c2d2047671cf74e8f.jpg";
            Glide.with(this)
                    .load(cheesecakeImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String gullacImgUrl = "https://i.pinimg.com/736x/77/5e/dc/775edcfdd846b100f8396e925e346a50.jpg";
            Glide.with(this)
                    .load(gullacImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        }
    }
}
