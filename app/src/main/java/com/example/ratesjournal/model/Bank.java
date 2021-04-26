package com.example.ratesjournal.model;

import java.util.ArrayList;

public class Bank {

    protected String name;

    protected ArrayList<RateData> rates;

    public Bank(String name, ArrayList<RateData> rates) {
        this.name = name;
        this.rates = rates;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<RateData> getRates() {
        return this.rates;
    }
}
