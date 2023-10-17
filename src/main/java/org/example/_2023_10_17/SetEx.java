package org.example._2023_10_17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * fori
 * forEach
 */
public class SetEx {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Ivanov");
        stringMap.put(1, "Petrov");

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(15);
        set.add(52);
        set.add(35);
        set.add(5);

    }
}
