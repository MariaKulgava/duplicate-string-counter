package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] arrs) {

        List<String> input = Arrays.asList("dog", "cat", "dog", "monkey", "cat", "dog", "fox", null);

        Map<String, Integer> duplicates = findDuplicateStrings(input);

        // Print the result
        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<String, Integer> findDuplicateStrings(List<String> strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> duplicateMap = new HashMap<>();

        // Count occurrences of each string
        for (String str : strings) {
            if (str != null) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }
        }

        // Filter strings that occur more than once
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateMap.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicateMap;
    }

}
