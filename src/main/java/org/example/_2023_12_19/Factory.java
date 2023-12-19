package org.example._2023_12_19;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Factory implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : The task was done");
    }

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(11);

        executorService.scheduleAtFixedRate(new Factory(), 7, 7, TimeUnit.MILLISECONDS);
        executorService.scheduleAtFixedRate(new Factory(), 7, 7, TimeUnit.MILLISECONDS);
        executorService.scheduleAtFixedRate(new Factory(), 7, 7, TimeUnit.MILLISECONDS);

        Thread.sleep(150);
        executorService.shutdown();
    }
}
