package org.example._2023_12_19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExample implements Callable<Integer> {

    private final int target;

    public FutureTaskExample(int target) {
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
        int target = 3;
        Callable<Integer> callable = new FutureTaskExample(target);
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println(futureTask.get());
    }
}
