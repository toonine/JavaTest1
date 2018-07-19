package com.example.demo;

public class DataFactoryImpl implements DataFactory {
    private static Data instance;

    @Override
    public Data getData() {
        if (instance == null) {
            return new Data(100, 50);
        }
        return instance;
    }
}
