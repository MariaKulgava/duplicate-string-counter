# Duplicate String Counter

## Overview
This Java implementation identifies duplicate strings in a list and counts their occurrences. It is designed to be efficient, concise, and robust, handling potential issues such as `null` values gracefully.

---

## Why This Implementation?

### 1. **Stream API for Conciseness and Readability**
- We leveraged the **Stream API** to handle the logic for grouping, counting, filtering, and collecting results. This makes the code concise and expressive, reducing boilerplate code commonly associated with traditional loops and conditional checks.
- The use of **`Collectors.groupingBy`** and **`Collectors.counting`** simplifies the process of counting occurrences in a functional programming style, making it easier to read and maintain.

### 2. **Null Safety**
- A `filter(Objects::nonNull)` step is added to exclude `null` values from the processing pipeline. This prevents `NullPointerException` during the grouping and counting operations.
- Handling `null` explicitly ensures the program is robust and doesn't break when unexpected `null` values are present in the input list.

### 3. **Efficiency**
- The algorithm processes the input list in a single pass using grouping and counting, resulting in a time complexity of approximately **O(n)**.
- Filtering and post-processing operate on a reduced dataset, ensuring performance even for larger inputs.

---

## Usage Example

### Input:
```java
List<String> input = Arrays.asList("dog", "cat", "dog", "monkey", "cat", "dog", "fox", null);
```

### Output:
```text
dog: 3
cat: 2
```

---