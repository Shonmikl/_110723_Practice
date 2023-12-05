package org.example._2023_12_5;

public class DL {
    public static final Object LOCK_1 = new Object();
    public static final Object LOCK_2 = new Object();

    public static void main(String[] args) {
        THR1 t1 = new THR1();
        THR2 t2 = new THR2();

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}

class THR1 extends Thread {

    @Override
    public void run() {
        System.out.println("T1 try to catch LOCK_1");
        synchronized (DL.LOCK_1) {
            System.out.println("T1 <---> LOCK_1");
            System.out.println("T1 try to catch LOCK_2");
            synchronized (DL.LOCK_2) {
                System.out.println("T1 <---> LOCK_1 AND LOCK_2");
            }
        }
    }
}

class THR2 extends Thread {
    @Override
    public void run() {
        System.out.println("T2 try to catch LOCK_2");
        synchronized (DL.LOCK_2) {
            System.out.println("T2 <---> LOCK_2");
            System.out.println("T2 try to catch LOCK_1");
            synchronized (DL.LOCK_1) {
                System.out.println("T2 <---> LOCK_2 AND LOCK_1");
            }
        }
    }
}
