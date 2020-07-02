package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAddRemoveModified {
    private List<Integer> list = new ArrayList<>();

    public boolean addMod(int element) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + element);
        }
        return list.add(element);
    }

    public void removeMod(int element) {
        int temp = list.get(element);
        list.remove(element);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - temp);
        }
    }

    public int get(int index) {
        return list.get(index);
    }

    public boolean contains(Integer integer) {
        return list.contains(integer);
    }

    public int max() {
        return Collections.max(list);
    }

    public int min() {
        return Collections.min(list);
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
