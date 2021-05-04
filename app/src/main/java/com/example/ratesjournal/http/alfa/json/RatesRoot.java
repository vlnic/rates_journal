package com.example.ratesjournal.http.alfa.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RatesRoot {

    @SerializedName("rates")
    @Expose
    private List<Rates> rates;

    public RatesRoot setRates(List<Rates> rates) {
        this.rates = rates;
        return this;
    }

    public List<Rates> getRates() {
        return this.rates;
    }
}
