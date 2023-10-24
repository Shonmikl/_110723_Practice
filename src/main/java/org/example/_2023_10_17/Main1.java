package org.example._2023_10_17;

public class Main1 {
    int nonStatic = 0;
    static int staticInt = 0;

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        Main1 main2 = new Main1();

        main1.nonStatic = 777;
        System.out.println(main2.nonStatic);

        Main1.staticInt = 11111;
    }
}