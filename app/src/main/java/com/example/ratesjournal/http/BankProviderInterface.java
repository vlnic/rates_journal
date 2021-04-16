package com.example.ratesjournal.http;

import com.example.ratesjournal.model.Rate;

import java.util.ArrayList;

public interface BankProviderInterface {

    ArrayList<Rate> loadRates();
}
