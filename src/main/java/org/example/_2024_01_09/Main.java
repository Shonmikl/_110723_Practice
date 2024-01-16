package org.example._2024_01_09;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class printerClass  = Class.forName("org.example._2024_01_09.Printer");

        Field[] field = printerClass.getDeclaredFields();
        System.out.println(Arrays.toString(field));
    }
}

class Printer {
    public int id;
    private double price;

    public Printer() {
    }

    public Printer(int id) {
        this.id = id;
    }
}