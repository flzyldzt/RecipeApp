package com.example.yemektarifiapp.subcategory.salad.detail;

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
import com.example.yemektarifiapp.subcategory.salad.networking.SaladTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SaladDetailFragment extends Fragment {


    private FragmentDetailBinding binding;
    SaladTariffResponseModel detail;

    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;
    public static final String SALAD_RECIPE_MODEL_DETAIL_KEY = "saladDetail";

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
        pullWithGlideSalads();
    }

    private void initArguments() {
        detail = (SaladTariffResponseModel) requireArguments().getSerializable(SALAD_RECIPE_MODEL_DETAIL_KEY);
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

    public void pullWithGlideSalads() {
        if (detail.getId().equals("1")) {
            String arpaSehriyeImgUrl = "https://i.pinimg.com/736x/d4/df/cf/d4dfcf9af7f7ecf30e3c9ae70c837af1.jpg";
            Glide.with(this)
                    .load(arpaSehriyeImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String mercimekKöftesiImgUrl = "https://i.pinimg.com/736x/64/5d/80/645d804543bd57d12106576b11853feb.jpg";
            Glide.with(this)
                    .load(mercimekKöftesiImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String haydariImgUrl = "https://ziyafet.com.tr/uploads/tarif/orjinal-haydari-195.jpg";
            Glide.with(this)
                    .load(haydariImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String humusImgUrl = "https://2lokma.com/wp-content/uploads/2013/02/Screen-shot-2013-02-28-at-10.30.45-AM.png";
            Glide.with(this)
                    .load(humusImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String kisirImgUrl = "https://i.pinimg.com/736x/e9/c7/40/e9c7406bb320e3079bc1ca935b011d7e.jpg";
            Glide.with(this)
                    .load(kisirImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);

        }
    }
}
