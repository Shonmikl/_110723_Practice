package org.example._2023_12_19;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Taski implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : DEPARTMENT DONE");
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(25);
        executor.execute(new Taski());
        executor.execute(new Taski());
        executor.execute(new Taski());
        executor.execute(new Taski());
        executor.execute(new Taski());

        executor.shutdown();
    }
}
