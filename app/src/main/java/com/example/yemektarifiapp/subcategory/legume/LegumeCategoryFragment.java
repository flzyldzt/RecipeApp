package com.example.yemektarifiapp.subcategory.legume;

import static com.example.yemektarifiapp.subcategory.legume.detail.LegumeDetailFragment.LEGUME_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.legume.adapter.LegumeCategoryAdapter;
import com.example.yemektarifiapp.subcategory.legume.adapter.LegumeTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.legume.detail.LegumeDetailFragment;
import com.example.yemektarifiapp.subcategory.legume.networking.LegumeTariffResponseModel;
import com.example.yemektarifiapp.subcategory.legume.networking.LegumeTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LegumeCategoryFragment extends Fragment implements LegumeTariffOnClickInterface {
    private FragmentSubCategoryBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callLegumeTariffService();
        return binding.getRoot();
    }

    private void callLegumeTariffService() {
        LegumeTariffServiceInterface legumeTariffServiceInterface;
        legumeTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(LegumeTariffServiceInterface.class);
        Call<List<LegumeTariffResponseModel>> call = legumeTariffServiceInterface.getLegumeTariffService();
        call.enqueue(new Callback<List<LegumeTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<LegumeTariffResponseModel>> call, Response<List<LegumeTariffResponseModel>> response) {
                List<LegumeTariffResponseModel> legumeTariffList;
                legumeTariffList = response.body();
                if (legumeTariffList != null && !legumeTariffList.isEmpty()) {
                    initAdapter(legumeTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<LegumeTariffResponseModel>> call, Throwable t) {

            }
        });
    }

    public void initAdapter(List<LegumeTariffResponseModel> legumeTariffResponseModelList) {
        if (!legumeTariffResponseModelList.isEmpty()) {
            LegumeCategoryAdapter adapter = new LegumeCategoryAdapter(legumeTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(LegumeTariffResponseModel legumeTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(LEGUME_RECIPE_MODEL_DETAIL_KEY, legumeTariffResponseModel);

        Fragment fragment = new LegumeDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}
