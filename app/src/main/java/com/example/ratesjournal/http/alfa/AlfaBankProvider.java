package com.example.ratesjournal.http.alfa;

import androidx.annotation.NonNull;
import com.example.ratesjournal.http.BankProviderInterface;
import com.example.ratesjournal.http.alfa.json.Rates;
import com.example.ratesjournal.http.alfa.json.RatesRoot;
import com.example.ratesjournal.model.Bank;
import com.example.ratesjournal.model.Currency;
import com.example.ratesjournal.model.RateData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class AlfaBankProvider implements BankProviderInterface {

    protected String host;

    protected List<String> errors;

    public AlfaBankProvider() {
        this.host = "https://developerhub.alfabank.by:8273";
        this.errors = new ArrayList<String>();
    }

    public void flushRates() {

    }

    @Override
    public ArrayList<RateData> loadRates() {

        return this.requestRates();
    }

    @Override
    public Bank bank() {
        return new Bank("Alfa", "Альфа банк", this.loadRates());
    }

    protected ArrayList<RateData> requestRates()
    {
        ArrayList<RateData> rates = new ArrayList<RateData>();
        this.buildClient()
                .getRateList()
                .enqueue(new Callback<RatesRoot>() {
                    @Override
                    public void onResponse(@NonNull Call<RatesRoot> call, @NonNull Response<RatesRoot> response) {
                        assert response.body() != null;
                        for(Rates r : response.body().getRates())
                            rates.add(
                                    new RateData(
                                            new Currency(
                                                    r.getBuyIso(),
                                                    r.getBuyRate()),
                                            new Currency(
                                                    r.getSellIso(),
                                                    r.getSellRate()
                                            ),
                                            r.getDate()
                                    )
                            );
                    }

                    @Override
                    public void onFailure(@NonNull Call<RatesRoot> call, @NonNull Throwable t) {
                        errors.add(t.getMessage());
                    }
                });
        return rates;
    }

    protected AlfaPlaceholderApi buildClient() {
        return new Retrofit.Builder()
                .baseUrl(this.host)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AlfaPlaceholderApi.class);
    }
}
