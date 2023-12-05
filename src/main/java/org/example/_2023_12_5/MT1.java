package org.example._2023_12_5;

public class MT1 {
    public static void get() {
        System.out.println("!");
        System.out.println("!11");

        synchronized (MT1.class) {
            System.out.println("!22");
            System.out.println("!33");
        }

        System.out.println("!44");
    }
}
