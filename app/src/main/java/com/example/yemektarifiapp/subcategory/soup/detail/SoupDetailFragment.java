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

import com.bumptech.glide.Glide;
import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.databinding.FragmentDetailBinding;
import com.example.yemektarifiapp.databinding.LayoutBottomSheetDialogMaterialBinding;
import com.example.yemektarifiapp.subcategory.soup.networking.SoupTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SoupDetailFragment extends Fragment {


    private FragmentDetailBinding binding;
    SoupTariffResponseModel detail;
    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;
    public static final String SOUP_RECIPE_MODEL_DETAIL_KEY = "soupDetail";


    @Override
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
        pullWithGlideSoups();
    }

    private void initArguments() {
        detail = (SoupTariffResponseModel) requireArguments().getSerializable(SOUP_RECIPE_MODEL_DETAIL_KEY);
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

    public void pullWithGlideSoups() {
        if (detail.getId().equals("1")) {
            String ezogelinImageUrl = "https://i.pinimg.com/originals/15/7c/b6/157cb68c58f4c745be8098a0e17dd2df.png";
            Glide.with(this)
                    .load(ezogelinImageUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String yaylaImageUrl = "https://kalorisor.com/uploads/images/urun/yayla-corbasi.jpg";
            Glide.with(this)
                    .load(yaylaImageUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String mercimekImageUrl = "https://i.pinimg.com/originals/c3/cf/e5/c3cfe5817923b5f28a83559badcc0bb5.jpg";
            Glide.with(this)
                    .load(mercimekImageUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String mantarImageUrl = "https://i.pinimg.com/736x/a9/4f/83/a94f836bf7769a5f9ecf95534e162ea7.jpg";
            Glide.with(this)
                    .load(mantarImageUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String tavukImageUrl = "https://www.idilyazar.com/wp-content/uploads/2022/10/tavuksuyucorba.png";
            Glide.with(this)
                    .load(tavukImageUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        }
    }
}
