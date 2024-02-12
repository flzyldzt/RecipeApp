package com.example.yemektarifiapp.subcategory.legume.detail;

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
import com.example.yemektarifiapp.subcategory.legume.networking.LegumeTariffResponseModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class LegumeDetailFragment extends Fragment {

    private FragmentDetailBinding binding;

    LegumeTariffResponseModel detail;
    public BottomSheetDialog bottomSheetDialogMaterial, bottomSheetDialogRecipe;
    public static final String LEGUME_RECIPE_MODEL_DETAIL_KEY = "legumeDetail";

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
        pullWithGlideLegumes();
    }

    private void initArguments() {
        detail = (LegumeTariffResponseModel) requireArguments().getSerializable(LEGUME_RECIPE_MODEL_DETAIL_KEY);
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

    public void pullWithGlideLegumes() {
        if (detail.getId().equals("1")) {
            String fellahKöfteImgUrl = "https://i.pinimg.com/736x/0c/38/cd/0c38cdae614a141de50baf63d3258e5e.jpg";
            Glide.with(this)
                    .load(fellahKöfteImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("2")) {
            String icliKöfteImgUrl = "https://i.pinimg.com/564x/4f/4b/11/4f4b11668db4a6cb6a0e83bf98a99801.jpg";
            Glide.with(this)
                    .load(icliKöfteImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("3")) {
            String kuruFasulyeImgUrl = "https://i.pinimg.com/564x/11/8b/1f/118b1f7d601591e63e222c0aea803cd8.jpg";
            Glide.with(this)
                    .load(kuruFasulyeImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else if (detail.getId().equals("4")) {
            String keskekImgUrl = "https://img.piri.net/piri/upload/image/2018/4/1/7f8e569c-2_44794828.png";
            Glide.with(this)
                    .load(keskekImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        } else {
            String barbunyaPilakiImgUrl = "https://www.idilyazar.com/wp-content/uploads/2022/09/barbunya1-1200x895.png";
            Glide.with(this)
                    .load(barbunyaPilakiImgUrl)
                    .error(R.drawable.error)
                    .into(binding.ivDetailPicture);
        }
    }
}
