package com.example.demo;

public enum Tax {
    INTANECE;
    private static final int[] LEVEL = {0, 1500, 4500, 9000, 35000, 55000, 80000};
    private static final int[] RATE = {3, 10, 20, 25, 30, 35, 45};
    private static double[] T = new double[LEVEL.length];

    static {
        T[0] = 0.0;
        for (int i = 1; i < LEVEL.length; i++) {
            T[i] = T[i] + (LEVEL[i] - LEVEL[i - 1]) * (RATE[i] / 100.0);
        }
    }

    public double calculateTax(double salary) {
        salary -= 3500;
        double tax = 0.0;
        for (int i = LEVEL.length - 1; i >= 0; i--) {
            int level = LEVEL[i];
            if (salary >= level) {
                tax += T[i];
                tax += (salary - level) * (RATE[i] / 100.0);
                break;
            }
        }
        return tax;
    }
}
