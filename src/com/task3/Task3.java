package com.task3;

import java.util.HashMap;
import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 2, 35, 4, 5, 5, 6, 7, 7, 8};
        System.out.println(findDuplicatesUsingHashMap(arr));
        System.out.println(findDuplicatesUsingHashSet(arr));
    }

    private static boolean findDuplicatesUsingHashMap(int[] inputArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : inputArray) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean findDuplicatesUsingHashSet(int[] inputArray) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : inputArray) {
            if (!set.add(element)) {
                return true;
            }
        }
        return false;
    }
}

