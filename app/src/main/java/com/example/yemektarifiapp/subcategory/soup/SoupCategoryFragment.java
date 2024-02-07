package com.example.yemektarifiapp.subcategory.soup;

import static com.example.yemektarifiapp.subcategory.soup.detail.SoupDetailFragment.SOUP_RECIPE_MODEL_DETAIL_KEY;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.yemektarifiapp.databinding.FragmentSubCategoryBinding;
import com.example.yemektarifiapp.subcategory.soup.adapter.SoupCategoryAdapter;
import com.example.yemektarifiapp.subcategory.soup.adapter.SoupTariffOnClickInterface;
import com.example.yemektarifiapp.subcategory.soup.detail.SoupDetailFragment;
import com.example.yemektarifiapp.subcategory.soup.networking.SoupTariffResponseModel;
import com.example.yemektarifiapp.subcategory.soup.networking.SoupTariffServiceInterface;
import com.example.yemektarifiapp.util.ChangeFragment;
import com.example.yemektarifiapp.util.RetrofitProvider;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SoupCategoryFragment extends Fragment implements SoupTariffOnClickInterface {

    private FragmentSubCategoryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSubCategoryBinding.inflate(inflater, container, false);
        callSoupTariffService();
        return binding.getRoot();
    }

    private void callSoupTariffService() {
        SoupTariffServiceInterface soupTariffServiceInterface;
        soupTariffServiceInterface = RetrofitProvider
                .getRetrofitInstance()
                .create(SoupTariffServiceInterface.class);
        Call<List<SoupTariffResponseModel>> call = soupTariffServiceInterface.getSoupTariffService();
        call.enqueue(new Callback<List<SoupTariffResponseModel>>() {
            @Override
            public void onResponse(Call<List<SoupTariffResponseModel>> call, Response<List<SoupTariffResponseModel>> response) {
                List<SoupTariffResponseModel> soupTariffList;
                soupTariffList = response.body();
                if (soupTariffList != null && !soupTariffList.isEmpty()) {
                    initAdapter(soupTariffList);
                }
            }

            @Override
            public void onFailure(Call<List<SoupTariffResponseModel>> call, Throwable t) {
                Toast.makeText(requireContext(), "Hata Mesajı :" + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("Mylog", "t.getMessage():" + t.getMessage() + "\n" +
                        "t:" + t
                );
            }
        });
    }


    public void initAdapter(List<SoupTariffResponseModel> soupTariffResponseModelList) {
        if (!soupTariffResponseModelList.isEmpty()) {
            SoupCategoryAdapter adapter = new SoupCategoryAdapter(soupTariffResponseModelList, this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            binding.recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onItemClick(SoupTariffResponseModel soupTariffResponseModel, int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(SOUP_RECIPE_MODEL_DETAIL_KEY, soupTariffResponseModel);

        Fragment fragment = new SoupDetailFragment();
        fragment.setArguments(bundle);

        ChangeFragment changeFragment = new ChangeFragment(getContext());
        changeFragment.change(fragment);
    }
}