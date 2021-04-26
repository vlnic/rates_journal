package com.example.ratesjournal.http.alfa;

import com.example.ratesjournal.http.BankProviderInterface;
import com.example.ratesjournal.model.Currency;
import com.example.ratesjournal.model.RateData;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;

public class AlfaBankProvider implements BankProviderInterface {

    protected String host;

    public AlfaBankProvider() {
        this.host = "https://developerhub.alfabank.by:8273";
    }

    @Override
    public ArrayList<RateData> loadRates() {
        ArrayList<RateData> rates = new ArrayList<RateData>();
        rates.add(new RateData(new Currency("RUB", 41.45), new Currency("USD", 56.78)));
        return rates;
    }

    protected void requestRates()
    {
        Retrofit client = new Retrofit.Builder()
                .baseUrl(this.host)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
