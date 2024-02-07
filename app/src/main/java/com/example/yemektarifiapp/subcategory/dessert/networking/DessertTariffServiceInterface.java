package com.example.yemektarifiapp.subcategory.dessert.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DessertTariffServiceInterface {

    @GET("86e7ac49-51b7-43ec-a5fe-6eac7fe562f3")
    Call<List<DessertTariffResponseModel>> getDessertTariffService();
}
