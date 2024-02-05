package com.example.yemektarifiapp.subcategory.soup.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SoupTariffServiceInterface {
    @GET("b0ac6e85-5475-4093-905b-7f353d324d47")
        //soupTariff
    Call<List<SoupTariffResponseModel>> getSoupTariffService();
}
