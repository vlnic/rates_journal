package com.example.ratesjournal.http.alfa;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlfaPlaceholderApi {

    @GET("/partner/1.0.1/public/rates")
    Call<AlfaRate> getRateList();
}
