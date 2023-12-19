package org.example._2023_12_19;

import java.util.Arrays;
import java.util.concurrent.*;

public class Factorial implements Callable<Integer> {
    private final int target;

    public Factorial(int target) {
        this.target = target;
    }

    @Override
    public Integer call() {
        int result = 1;
        for (int i = 2; i <= target; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int idx = 10;
        ExecutorService service = Executors.newFixedThreadPool(idx);
        Future<Integer>[] future = new Future[idx];

        for (int i = 1; i < idx; i++) {
            Callable<Integer> resultHandler = new Factorial(i);
            future[i] = service.submit(resultHandler);
        }

        for (int i = 1; i < idx; i++) {
            System.out.println(future[i].get());
        }

        service.shutdown();
    }
}