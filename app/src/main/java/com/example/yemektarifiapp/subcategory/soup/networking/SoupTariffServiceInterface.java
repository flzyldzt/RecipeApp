package com.example.yemektarifiapp.subcategory.soup.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SoupTariffServiceInterface {
    @GET("4ade2d27-7c92-4bf6-a35d-02bb94a0e6b2")
        //soupTariff
    Call<List<SoupTariffResponseModel>> getSoupTariffService();
}
