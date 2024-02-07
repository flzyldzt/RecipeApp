package com.example.yemektarifiapp.subcategory.legume.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LegumeTariffServiceInterface {

    @GET("3ad2a0a9-c2ec-434f-8809-7276489f2f56")
    Call<List<LegumeTariffResponseModel>> getLegumeTariffService();
}
