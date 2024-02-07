package com.example.yemektarifiapp.subcategory.meat.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MeatTariffServiceInterface {
    @GET("1f5cf306-0bfe-46a3-9641-c4abb891b0f6")
    Call<List<MeatTariffResponseModel>> getMeatTariffService();
}
