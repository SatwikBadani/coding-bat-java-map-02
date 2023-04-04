package org.example.runner;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
 *
 *
 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) → {}
 */
public class MapFirstChar {

    public Map<String, String> firstChar(String[] strings) {
        return Arrays.stream(strings)
                .collect(Collectors.groupingBy(x -> String.valueOf(x.charAt(0)), Collectors.joining()));
    }

}
