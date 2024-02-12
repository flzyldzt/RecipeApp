package com.example.yemektarifiapp.subcategory.meat.detail;

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
import com.example.yemektarifiapp.subcategory.meat.networking.MeatTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MeatDetailFragment extends Fragment {
    private FragmentDetailBinding binding;
    MeatTariffResponseModel detail;
    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;

    public static final String MEAT_RECIPE_MODEL_DETAIL_KEY = "meatDetail";

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
        pullWithGlideMeats();
    }

    private void initArguments() {
        detail = (MeatTariffResponseModel) requireArguments().getSerializable(MEAT_RECIPE_MODEL_DETAIL_KEY);
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

    public void pullWithGlideMeats() {
        if (detail.getId().equals("1")) {
            String kadinBuduKofteImgUrl = "https://i.pinimg.com/originals/c3/1d/17/c31d17a0185b4e4890ee49fe455f72eb.jpg";
            Glide.with(this)
                    .load(kadinBuduKofteImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String beytiKebabiImgUrl = "https://i.pinimg.com/originals/d9/cf/a2/d9cfa2afe682a35452253de70b7a87ad.png";
            Glide.with(this)
                    .load(beytiKebabiImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String tavukSoteImgUrl = "https://i.pinimg.com/originals/38/2e/c2/382ec2ea3db4ae4791de2aa7f39c2112.png";
            Glide.with(this)
                    .load(tavukSoteImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String aliNazikKebabiImgUrl = "https://i.pinimg.com/736x/09/28/4f/09284fa24f7cc4f42ee18a1a2202ed47.jpg";
            Glide.with(this)
                    .load(aliNazikKebabiImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String köftePatatesImgUrl = "https://i.pinimg.com/originals/21/3f/51/213f5126ba8951c590cafbb7b2124ff9.jpg";
            Glide.with(this)
                    .load(köftePatatesImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        }
    }
}
