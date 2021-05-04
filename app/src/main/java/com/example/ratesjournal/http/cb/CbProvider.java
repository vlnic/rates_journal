package com.example.ratesjournal.http.cb;

import com.example.ratesjournal.http.BankProviderInterface;
import com.example.ratesjournal.model.Bank;
import com.example.ratesjournal.model.RateData;

import java.util.ArrayList;

public class CbProvider implements BankProviderInterface {

    @Override
    public ArrayList<RateData> loadRates() {
        return new ArrayList<RateData>();
    }

    @Override
    public Bank bank() {
        return new Bank("CB", "Центральный банк РФ", this.loadRates());
    }
}
