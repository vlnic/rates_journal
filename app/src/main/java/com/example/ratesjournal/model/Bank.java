package com.example.ratesjournal.model;

import java.util.ArrayList;

public class Bank {

    protected String name;

    protected ArrayList<Rate> rates;

    public Bank(String name, ArrayList<Rate> rates) {
        this.name = name;
        this.rates = rates;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Rate> getRates() {
        return this.rates;
    }
}
