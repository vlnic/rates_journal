package com.example.ratesjournal.model;

public class Currency {

    protected String code;

    protected double value;

    public Currency(String code, double value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return this.code;
    }

    public double getValue() {
        return this.value;
    }
}
