package com.example.demo;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        DataFactory dataFactory = new DataFactoryImpl();
        Data data = dataFactory.getData();
        Map<Integer, List<Integer>> map = data.generateAndSort();
        System.out.println(map);
    }
}
