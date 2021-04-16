package com.example.ratesjournal.model;

public class Rate {

    protected Currency f;

    protected Currency s;

    public Rate(Currency f, Currency s) {
        this.f = f;
        this.s = s;
    }

    public String getPairName()
    {
        return System.out.printf("%s %s", f.getCode(), s.getCode()).toString();
    }

    public String getPairValue()
    {
        return System.out.printf("%f %f", f.getValue(), s.getValue()).toString();
    }
}