package com.example.yemektarifiapp.subcategory.dessert.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DessertTariffServiceInterface {

    @GET("desserts.json")
    Call<List<DessertTariffResponseModel>> getDessertTariffService();
}
