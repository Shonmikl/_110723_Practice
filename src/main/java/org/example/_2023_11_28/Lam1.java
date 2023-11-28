package org.example._2023_11_28;

public class Lam1 {
    public static void main(String[] args) {
        m(Lam1::r);
        m((text) -> System.out.println(text));
    }

    public static void r(String s) {
        if("mama".equals(s)) {
            System.out.println("equals mama");
        } else {
            System.out.println(s);
        }
    }

    public static void m(In in) {
        in.get("***!***");
    }
}

@FunctionalInterface
interface In {
    void get(String s);
}