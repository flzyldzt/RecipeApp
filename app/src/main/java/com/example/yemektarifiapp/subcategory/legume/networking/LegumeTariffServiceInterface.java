package com.example.yemektarifiapp.subcategory.legume.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LegumeTariffServiceInterface {

    @GET("legumes.json")
    Call<List<LegumeTariffResponseModel>> getLegumeTariffService();
}
