package org.example._2023_11_2;

import java.util.HashMap;
import java.util.Map;

public class Inn {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}