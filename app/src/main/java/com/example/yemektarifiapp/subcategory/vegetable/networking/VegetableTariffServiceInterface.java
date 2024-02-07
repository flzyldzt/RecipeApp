package com.example.yemektarifiapp.subcategory.vegetable.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VegetableTariffServiceInterface {

    @GET("vegetables.json")
    Call<List<VegetableTariffResponseModel>> getVegetableTariffService();
}
