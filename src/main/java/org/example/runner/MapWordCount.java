package org.example.runner;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
 *
 *
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class MapWordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        return Arrays.stream(strings)
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(e -> 1)));
    }

}
