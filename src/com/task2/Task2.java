package com.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] arr2 = {5, 2, 1, 7, 4, 6, 3, 8};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(Arrays.toString(arrayIndexSumCheck(arr, 5)));
        System.out.println(arrayIndexSumCheckWithList(arrayList, 15));

    }

    static int[] arrayIndexSumCheck(int[] array, int value) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        int[] resultArray = new int[2];
        while (start < end) {
            if ((array[start] + array[end]) > value) {
                end--;
            } else if ((array[start] + array[end]) < value) {
                start++;
            } else {
                resultArray = new int[]{start, end};
                return resultArray;
            }
        }
        return resultArray;
    }

    static Set<Integer> arrayIndexSumCheckWithList(List<Integer> list, int value) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int arg2 = value - list.get(i);
            if (list.contains(arg2)) {
                set.add(list.indexOf(list.get(i)));
                set.add(list.indexOf(arg2));
                return set;
            }
        }
        return set;
    }

}
