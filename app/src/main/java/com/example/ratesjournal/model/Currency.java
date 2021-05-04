package com.example.ratesjournal.model;

public class Currency implements Entity {

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

    public static String tableSchema() {
        return "CREATE TABLE " + Currency.tableName() + " (id INT PRIMARY KEY AUTO INCREMENT, code TEXT, bank INT);";
    }

    public static String tableName() {
        return "currencies";
    }
}
