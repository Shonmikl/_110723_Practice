package org.example._2023_11_7;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(FAKER.funnyName().name());
        }
        // S W E D S Q
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}