package com.example.ratesjournal.model;

import java.util.ArrayList;

public class Bank implements Entity {

    protected String name;

    protected ArrayList<RateData> rates;

    protected String code;

    public Bank(String code, String name, ArrayList<RateData> rates) {
        this.code = code;
        this.name = name;
        this.rates = rates;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<RateData> getRates() {
        return this.rates;
    }

    public static String tableSchema() {
        return "CREATE TABLE " + Bank.tableName() + " (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, code TEXT);";
    }

    public static String tableName() {
        return "banks";
    }
}
