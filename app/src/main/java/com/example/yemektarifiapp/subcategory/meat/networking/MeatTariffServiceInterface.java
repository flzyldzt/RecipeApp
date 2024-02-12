package com.example.yemektarifiapp.subcategory.meat.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MeatTariffServiceInterface {
    @GET("meats.json")
    Call<List<MeatTariffResponseModel>> getMeatTariffService();
}
