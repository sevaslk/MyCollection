package com.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] arr2 = {5, 2, 1, 7, 4, 6, 3, 8};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr2));

        arrayIndexSumCheck(arr, 5);
        arrayIndexSumCheckWithList(arrayList, 15);

    }

    public static boolean arrayIndexSumCheck(int[] array, int value) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if ((array[start] + array[end]) > value) {
                end--;
            } else if ((array[start] + array[end]) < value) {
                start++;
            } else {
                System.out.println(start + ", " + end);
                return true;
            }
        }
        return false;
    }

    public static boolean arrayIndexSumCheckWithList(List<Integer> list, int value) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int arg2 = value - list.get(i);
            if (list.contains(arg2)) {
                set.add(list.indexOf(list.get(i)));
                set.add(list.indexOf(arg2));
                System.out.println(set);
                return true;
            }
        }
        return false;
    }

}
