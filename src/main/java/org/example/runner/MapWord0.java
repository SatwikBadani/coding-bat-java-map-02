package org.example.runner;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
 *
 *
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 */
public class MapWord0 {

    public Map<String, Integer> word0(String[] strings) {
        return Arrays.stream(strings).distinct().collect(Collectors.toMap(String::toString, str -> 0));
    }

}
