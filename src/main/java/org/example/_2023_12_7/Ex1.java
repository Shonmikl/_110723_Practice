package org.example._2023_12_7;

public class Ex1 extends Thread {
    @Override
    public void run() {
        System.out.println("Ex1");
    }

    public static void main(String[] args) {
        new Ex1().start();
    }
}
