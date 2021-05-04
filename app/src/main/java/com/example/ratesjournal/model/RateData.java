package com.example.ratesjournal.model;

import java.util.Date;

public class RateData {

    protected Currency buyRate;

    protected Currency sellRate;

    protected Date created;

    public RateData(Currency buyRate, Currency sellRate, Date created) {
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.created = created;

    }

    public String getPairName() {
        return System.out.printf("%s %s", buyRate.getCode(), sellRate.getCode()).toString();
    }

    public String getPairValue() {
        return System.out.printf("%f %f", buyRate.getValue(), sellRate.getValue()).toString();
    }
}
