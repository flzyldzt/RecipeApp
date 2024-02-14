package com.example.yemektarifiapp.subcategory.salad;

import static com.example.yemektarifiapp.subcategory.salad.detail.SaladDetailFragment.SALAD_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.salad.adapter.SaladCategoryAdapter;
import com.example.yemektarifiapp.subcategory.salad.adapter.SaladTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.salad.detail.SaladDetailFragment;
import com.example.yemektarifiapp.subcategory.salad.networking.SaladTariffResponseModel;
import com.example.yemektarifiapp.subcategory.salad.networking.SaladTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.networking.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SaladCategoryFragment extends Fragment implements SaladTariffOnClickInterface {

    private FragmentSubCategoryBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callSaladTariffService();
        return binding.getRoot();
    }

    private void callSaladTariffService() {
        SaladTariffServiceInterface saladTariffServiceInterface;
        saladTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(SaladTariffServiceInterface.class);
        Call<List<SaladTariffResponseModel>> call = saladTariffServiceInterface.getSaladTariffService();
        call.enqueue(new Callback<List<SaladTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<SaladTariffResponseModel>> call, Response<List<SaladTariffResponseModel>> response) {
                List<SaladTariffResponseModel> saladTariffList;
                saladTariffList = response.body();
                if (saladTariffList != null && !saladTariffList.isEmpty()) {
                    initAdapter(saladTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<SaladTariffResponseModel>> call, Throwable t) {
                Toast.makeText(requireContext(), "Hata Mesajı :" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Mylog", "t.getMessage():" + t.getMessage() + "\n" +
                        "t:" + t
                );
            }
        });
    }

    public void initAdapter(List<SaladTariffResponseModel> saladTariffResponseModelList) {
        if (!saladTariffResponseModelList.isEmpty()) {
            SaladCategoryAdapter adapter = new SaladCategoryAdapter(saladTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(SaladTariffResponseModel saladTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(SALAD_RECIPE_MODEL_DETAIL_KEY, saladTariffResponseModel);

        Fragment fragment = new SaladDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}
