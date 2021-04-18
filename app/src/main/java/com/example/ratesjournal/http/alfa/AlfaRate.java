package com.example.ratesjournal.http.alfa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class AlfaRate {

    @SerializedName("sellRate")
    @Expose
    private double sellRate;

    @SerializedName("buyRate")
    @Expose
    private double buyRate;

    @SerializedName("date")
    @Expose
    private Date date;

    @SerializedName("sellIso")
    @Expose
    private String sellIso;

    @SerializedName("buyIso")
    @Expose
    private String buyIso;

    @SerializedName("buyCode")
    @Expose
    private int buyCode;

    public double getSellRate() {
        return this.sellRate;
    }

    public AlfaRate setSellRate(double sellRate) {
        this.sellRate = sellRate;
        return this;
    }

    public double getBuyRate() {
        return this.buyRate;
    }

    public AlfaRate setBuyRate(double buyRate) {
        this.buyRate = buyRate;
        return this;
    }

    public String getBuyIso() {
        return this.buyIso;
    }

    public AlfaRate setBuyIso(String buyIso) {
        this.buyIso = buyIso;
        return this;
    }

    public String getSellIso() {
        return this.sellIso;
    }

    public AlfaRate setSellIso(String sellIso) {
        this.sellIso = sellIso;
        return this;
    }

    public int getBuyCode() {
        return this.buyCode;
    }

    public AlfaRate setBuyCode(int buyCode) {
        this.buyCode = buyCode;
        return this;
    }
}
