package org.example._2023_12_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MT2 {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(RANDOM.nextInt(6));
        }

        long sum =0;

        /**
         * 0-250.000
         * 250.001-500.000
         * 500.001-750.000
         * 750.001-999.999
         */
        new Thread(()-> {
            int l = 0;
            for (int i = 0; i < list.size() / 4; i++) {
                l = list.get(i);
            }
//            sum = sum + l;
        });
    }
}
