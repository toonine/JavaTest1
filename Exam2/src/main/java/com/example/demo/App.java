package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Double> example = new HashMap<>(4) {{
            put("userA", 5000.0);
            put("userB", 10000.0);
            put("userC", 15000.0);
            put("userD", 60000.0);
        }};
        example.forEach((name, salary) -> System.out.println(name + ": salary->" + salary + ", tax->" + Tax.INTANECE.calculateTax(salary)));
    }
}
