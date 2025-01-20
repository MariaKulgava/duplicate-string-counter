package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] arrs) {

        List<String> input = Arrays.asList("dog", "cat", "dog", "monkey", "cat", "dog", "fox", null);

        Map<String, Long> duplicates = findDuplicateStrings2(input);

        // Print the result
        duplicates.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    public static Map<String, Long> findDuplicateStrings2(List<String> strings) {
        return strings.stream()
                .filter(Objects::nonNull) // Filter out null values
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
