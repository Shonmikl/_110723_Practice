package org.example._2023_10_10;

import com.github.javafaker.Faker;

public class Test22 extends Faker {
    private static String getRandomName() {
        return new Test22().team().sport();
    }

    public static void main(String[] args) {
        System.out.println(getRandomName());

    }
}
