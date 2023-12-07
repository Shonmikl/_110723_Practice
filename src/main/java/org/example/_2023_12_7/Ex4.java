package org.example._2023_12_7;

import java.util.concurrent.*;

public class Ex4 implements Callable<Integer> {

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + 2;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Ex4 ex4 = new Ex4();

        Future<Integer> future = executorService.submit(ex4);
        System.out.println(future.get().intValue());
        executorService.shutdown();
    }
}
