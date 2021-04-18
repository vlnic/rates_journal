package com.example.ratesjournal.model;

public class RateData {

    protected Currency buyRate;

    protected Currency sellRate;

    public RateData(Currency buyRate, Currency sellRate) {
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getPairName()
    {
        return System.out.printf("%s %s", buyRate.getCode(), sellRate.getCode()).toString();
    }

    public String getPairValue()
    {
        return System.out.printf("%f %f", buyRate.getValue(), sellRate.getValue()).toString();
    }
}
