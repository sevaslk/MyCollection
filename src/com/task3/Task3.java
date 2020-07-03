package com.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 2, 35, 4, 5, 5, 6, 7, 7, 8};
        findDuplicates(arr);
        findDuplicatesUsingHashSet(arr);
    }

    private static void findDuplicates(int[] inputArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : inputArray) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }

    private static void findDuplicatesUsingHashSet(int[] inputArray) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int element : inputArray) {
            if (!set.add(element)) {
                System.out.println("Duplicate Element : " + element);
            }
        }
    }
}

