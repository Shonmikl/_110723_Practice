package org.example._2023_11_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lam2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu");
        list.forEach(System.out::println);

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(new Random().nextInt(55));
        }

        System.out.println(integers);

        integers.stream()
                .filter(digit -> digit % 2 == 0)
                .map(num -> num * 100)
                .forEach(System.out::println);
    }
}