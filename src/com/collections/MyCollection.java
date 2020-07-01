package com.collections;

import java.util.ArrayList;

public class MyCollection {
    private ArrayList<Integer> list = new ArrayList<>();

    public int get(int index) {
        return list.get(index);
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public boolean add(int element) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + element);
        }
        return list.add(element);
    }

    public void remove(int element) {
        int temp = list.get(element);
        list.remove(element);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - temp);
        }
    }

    public int max() {
        int max = list.get(0);
        for (Integer i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int min() {
        int min = list.get(0);
        for (Integer i : list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public double avg() {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (double) list.get(i);
        }
        return sum / list.size();
    }

    public int size() {
        return list.size();
    }

    void printCollection() {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}
