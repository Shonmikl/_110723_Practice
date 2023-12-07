package org.example._2023_12_7;

public class Ex2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Ex2");
    }

    public static void main(String[] args) {
        new Thread(new Ex2()).start();
    }
}
