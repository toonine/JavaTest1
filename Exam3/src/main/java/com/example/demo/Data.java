package com.example.demo;

import java.util.*;

class Data {
    private static final Random RANDOM = new Random();

    private int bound = 100;
    private int count = 50;

    public Data(int bound, int count) {
        this.bound = bound;
        this.count = count;
    }


    public Map<Integer, List<Integer>> generateAndSort() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(RANDOM.nextInt(bound));
        }
        int tmp = (bound - 1) / 10;
        Map<Integer, List<Integer>> map = new HashMap<>(tmp + 1);
        for (int i = 0; i <= tmp; i++) {
            map.put(i, new ArrayList<>(10));
        }
        list.forEach(it -> map.get(it / 10).add(it));
        map.forEach((key, l) -> l.sort(Integer::compareTo));
        return map;
    }

    private ArrayList<Integer> quickSort(ArrayList<Integer> l) {
        if (l.size() < 2) {
            return l;
        }
        final int index = l.get(0);
        final ArrayList<Integer> begin = new ArrayList<>();
        final ArrayList<Integer> end = new ArrayList<>();
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) < index) {
                begin.add(l.get(i));
            } else {
                end.add(l.get(i));
            }
        }

        ArrayList<Integer> resultList = quickSort(begin);
        resultList.add(index);
        resultList.addAll(quickSort(end));

        return resultList;
    }
}
