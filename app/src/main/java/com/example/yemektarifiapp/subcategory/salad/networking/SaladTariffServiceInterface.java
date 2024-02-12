package com.example.yemektarifiapp.subcategory.salad.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SaladTariffServiceInterface {

    @GET("salads.json")
    Call<List<SaladTariffResponseModel>> getSaladTariffService();
}
