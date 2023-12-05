package org.example._2023_11_28;

import java.util.ArrayList;
import java.util.List;

public class Lam1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        m(Lam1::r);
        m((text) -> System.out.println(text));
        m(s -> System.out.println("***-------***" + s));
    }

    public static void r(String s) {
        if("mama".equals(s)) {
            System.out.println("equals mama");
        } else {
            System.out.println(s);
        }
    }

    public static synchronized void m(In in) {
        in.get("***!***");
    }
}

@FunctionalInterface
interface In {
    void get(String s);//r
}