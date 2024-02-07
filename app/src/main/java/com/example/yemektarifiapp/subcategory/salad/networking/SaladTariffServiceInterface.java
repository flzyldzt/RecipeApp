package com.example.yemektarifiapp.subcategory.salad.networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SaladTariffServiceInterface {

    @GET("c1b89ef5-2e92-4fbd-8930-75debdaaa88a")
    Call<List<SaladTariffResponseModel>> getSaladTariffService();
}
