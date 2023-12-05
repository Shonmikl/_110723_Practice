package org.example._2023_12_5;

public class Vol extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Vol vol = new Vol();

        vol.start();
        Thread.sleep(2500);

        System.out.println("After sleeping....");
        vol.b = false;

        vol.join();
        System.out.println("MAIN END");
    }
}
