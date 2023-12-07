package org.example._2023_12_7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TP1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START!");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new R1());
        }
        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.SECONDS);
        System.out.println("MAIN END!");
    }
}

class R1 implements Runnable {

    @Override
    public void run() {
        System.out.println("NAME: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
