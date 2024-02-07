package com.example.yemektarifiapp.subcategory.vegetable;

import static com.example.yemektarifiapp.subcategory.vegetable.detail.VegetableDetailFragment.VEGETABLE_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.vegetable.adapter.VegetableCategoryAdapter;
import com.example.yemektarifiapp.subcategory.vegetable.adapter.VegetableTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.vegetable.detail.VegetableDetailFragment;
import com.example.yemektarifiapp.subcategory.vegetable.networking.VegetableTariffResponseModel;
import com.example.yemektarifiapp.subcategory.vegetable.networking.VegetableTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VegetableCategoryFragment extends Fragment implements VegetableTariffOnClickInterface {

    private FragmentSubCategoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callVegetableTariffService();
        return binding.getRoot();
    }

    private void callVegetableTariffService() {
        VegetableTariffServiceInterface vegetableTariffServiceInterface;
        vegetableTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(VegetableTariffServiceInterface.class);
        Call<List<VegetableTariffResponseModel>> call = vegetableTariffServiceInterface.getVegetableTariffService();
        call.enqueue(new Callback<List<VegetableTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<VegetableTariffResponseModel>> call, Response<List<VegetableTariffResponseModel>> response) {
                List<VegetableTariffResponseModel> vegetableTariffList;
                vegetableTariffList = response.body();
                if (vegetableTariffList != null && !vegetableTariffList.isEmpty()) {
                    initAdapter(vegetableTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<VegetableTariffResponseModel>> call, Throwable t) {
                Toast.makeText(requireContext(), "Hata Mesajı :" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Mylog", "t.getMessage():" + t.getMessage() + "\n" +
                        "t:" + t
                );
            }
        });
    }

    public void initAdapter(List<VegetableTariffResponseModel> vegetableTariffResponseModelList) {
        if (!vegetableTariffResponseModelList.isEmpty()) {
            VegetableCategoryAdapter adapter = new VegetableCategoryAdapter(vegetableTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(VegetableTariffResponseModel vegetableTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(VEGETABLE_RECIPE_MODEL_DETAIL_KEY, vegetableTariffResponseModel);

        Fragment fragment = new VegetableDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}
