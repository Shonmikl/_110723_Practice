package org.example._2023_11_6;

import java.util.ArrayList;
import java.util.List;

public class Gener {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        I<String> stringI = new I<>();
        stringI.value = "55";

        I<Integer> integerI = new I<>();
        integerI.value = 66;
    }
}

class I<I> {
    I value;

    public <I> I get(List<? extends I> list) {
        return (I) list.get(0);
    }
}