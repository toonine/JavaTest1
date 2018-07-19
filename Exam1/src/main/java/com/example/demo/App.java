package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 101-200间总共有xx个素数，分别是:xxx,xxx,xxx
 */
public class App {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>(21);
        for (int i = 101; i <= 200; i++) {
            int tmp = (int) Math.sqrt(i);
            int j = 2;
            for (; j <= tmp; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == tmp + 1) {
                result.add(i);
            }
        }
        System.out.print("101-200间总共有" + result.size() + "个素数，分别是:");
        for (int i = 0; i < result.size(); i++) {
            if (i == 0) {
                System.out.print(result.get(i));
            } else {
                System.out.print("," + result.get(i));
            }
        }
    }
}
