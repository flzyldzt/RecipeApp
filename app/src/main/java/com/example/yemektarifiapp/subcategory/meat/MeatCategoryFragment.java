package com.example.yemektarifiapp.subcategory.meat;

import static com.example.yemektarifiapp.subcategory.meat.detail.MeatDetailFragment.MEAT_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.meat.adapter.MeatCategoryAdapter;
import com.example.yemektarifiapp.subcategory.meat.adapter.MeatTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.meat.detail.MeatDetailFragment;
import com.example.yemektarifiapp.subcategory.meat.networking.MeatTariffResponseModel;
import com.example.yemektarifiapp.subcategory.meat.networking.MeatTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MeatCategoryFragment extends Fragment implements MeatTariffOnClickInterface {
    private FragmentSubCategoryBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callMeatTariffService();
        return binding.getRoot();
    }

    private void callMeatTariffService() {
        MeatTariffServiceInterface meatTariffServiceInterface;
        meatTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(MeatTariffServiceInterface.class);
        Call<List<MeatTariffResponseModel>> call = meatTariffServiceInterface.getMeatTariffService();
        call.enqueue(new Callback<List<MeatTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<MeatTariffResponseModel>> call, Response<List<MeatTariffResponseModel>> response) {
                List<MeatTariffResponseModel> meatTariffList;
                meatTariffList = response.body();
                if (meatTariffList != null && !meatTariffList.isEmpty()) {
                    initAdapter(meatTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<MeatTariffResponseModel>> call, Throwable t) {
                Toast.makeText(requireContext(), "Hata Mesajı :" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Mylog", "t.getMessage():" + t.getMessage() + "\n" +
                        "t:" + t
                );
            }
        });
    }

    public void initAdapter(List<MeatTariffResponseModel> meatTariffResponseModelList) {
        if (!meatTariffResponseModelList.isEmpty()) {
            MeatCategoryAdapter adapter = new MeatCategoryAdapter(meatTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }

    }

    @Override
    public void onItemClick(MeatTariffResponseModel meatTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(MEAT_RECIPE_MODEL_DETAIL_KEY, meatTariffResponseModel);

        Fragment fragment = new MeatDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}
