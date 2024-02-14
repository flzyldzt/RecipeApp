package com.example.yemektarifiapp.subcategory.dessert;

import static com.example.yemektarifiapp.subcategory.dessert.detail.DessertDetailFragment.DESSERT_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.dessert.adapter.DessertCategoryAdapter;
import com.example.yemektarifiapp.subcategory.dessert.adapter.DessertTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.dessert.detail.DessertDetailFragment;
import com.example.yemektarifiapp.subcategory.dessert.networking.DessertTariffResponseModel;
import com.example.yemektarifiapp.subcategory.dessert.networking.DessertTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.networking.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DessertCategoryFragment extends Fragment implements DessertTariffOnClickInterface {

    private FragmentSubCategoryBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callDessertTariffService();
        return binding.getRoot();
    }

    private void callDessertTariffService() {
        DessertTariffServiceInterface dessertTariffServiceInterface;
        dessertTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(DessertTariffServiceInterface.class);
        Call<List<DessertTariffResponseModel>> call = dessertTariffServiceInterface.getDessertTariffService();
        call.enqueue(new Callback<List<DessertTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<DessertTariffResponseModel>> call, Response<List<DessertTariffResponseModel>> response) {
                List<DessertTariffResponseModel> dessertTariffList;
                dessertTariffList = response.body();
                if (dessertTariffList != null && !dessertTariffList.isEmpty()) {
                    initAdapter(dessertTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<DessertTariffResponseModel>> call, Throwable t) {
                Toast.makeText(requireContext(), "Hata Mesajı :" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Mylog", "t.getMessage():" + t.getMessage() + "\n" +
                        "t:" + t
                );
            }
        });
    }

    public void initAdapter(List<DessertTariffResponseModel> dessertTariffResponseModelList) {
        if (!dessertTariffResponseModelList.isEmpty()) {
            DessertCategoryAdapter adapter = new DessertCategoryAdapter(dessertTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(DessertTariffResponseModel dessertTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(DESSERT_RECIPE_MODEL_DETAIL_KEY, dessertTariffResponseModel);

        Fragment fragment = new DessertDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}
