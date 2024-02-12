package com.example.yemektarifiapp.subcategory.soup.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SoupTariffServiceInterface {
    @GET("soups.json")
    Call<List<SoupTariffResponseModel>> getSoupTariffService();
}
