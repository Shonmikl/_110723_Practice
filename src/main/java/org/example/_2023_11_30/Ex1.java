package org.example._2023_11_30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 9, 8, 7};

        long d = Arrays.stream(array)
                .map(num -> num * 10)
                .count();

        /**
         * Создайте список строк и используйте
         * Stream API, чтобы создать новый список,
         * где каждая строка будет в верхнем регистре.
         */

        List<String> stringList = Arrays.asList("mama", "myla", "ramu");
        stringList.stream()
                .map((str) -> {
                    System.out.println("*******");
                    return str.toUpperCase();
                }).collect(Collectors.toList());

        List<String> sortedList = stringList.stream()
                .sorted()
                .toList();
    }
}
