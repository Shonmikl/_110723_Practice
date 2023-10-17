package org.example._2023_10_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimeTest {
    private static final int NUMBER_OF_ELEMENTS = 1_000_000;
    private static final List<Integer> LIST = new ArrayList<>(NUMBER_OF_ELEMENTS);
   // private static final List<Integer> LIST = new LinkedList<>(NUMBER_OF_ELEMENTS);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < LIST.size(); i++) {
            LIST.add(RANDOM.nextInt(22));
        }

        long startTime = System.currentTimeMillis();
        //m()
        long endTime = System.currentTimeMillis();
        System.out.println("TIME: " + (endTime - startTime));
    }
}
