package org.example._2023_10_26;

public class Main {
    public static void main(String[] args) {
        //Info info = new Info();
        Info<String> info = new Info<>("Java");
        System.out.println(info);

        //String s = (String) info.getValue();
        String s = info.getValue();
        System.out.println(s);
    }
}