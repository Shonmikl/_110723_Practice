package org.example._2023_10_10;

import com.github.javafaker.Faker;

import java.io.Serializable;

public class Test33 extends Faker implements Serializable, Inter {
    public static void main(String[] args) {
        System.out.println(new Test33().hashCode());
        new Test33().get();
    }

    @Override
    public void get(int... i) {
        System.out.println(i);
    }
}

interface Inter {
    void get(int... i);
}