package org.example._2023_10_31;

public class EE2 {
    public void m3() throws DivideByZeroException {
        System.out.println("m3");
        m2();
    }

    public void m2() throws DivideByZeroException {
        System.out.println("m2");
        m1();
    }

    public void m1() throws DivideByZeroException{
        System.out.println("m1");
    }

    public static void main(String[] args) {
        try {
            new EE2().m3();
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
    }
}
