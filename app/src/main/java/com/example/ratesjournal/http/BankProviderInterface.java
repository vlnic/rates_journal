package com.example.ratesjournal.http;

import com.example.ratesjournal.model.Bank;
import com.example.ratesjournal.model.RateData;

import java.util.ArrayList;

public interface BankProviderInterface {

    ArrayList<RateData> loadRates();

    Bank bank();
}
