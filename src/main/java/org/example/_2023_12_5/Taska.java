package org.example._2023_12_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Taska {
    private static long sum = 0;
    private static final Random RANDOM = new Random();
    List<Integer> list = new ArrayList<>(1_000_000);

    public static void main(String[] args) {
        Taska obj = new Taska();

        T1 t1 = new T1(0, obj.list.size() / 4);
        T1 t2 = new T1(obj.list.size() / 4, obj.list.size() / 2);

        t1.start();
        t2.start();
    }
}

class T1 extends Thread {
    long sum = 0;
    int start;
    int end;
    public T1(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < new Taska().list.size() / end; i++) {
            sum += new Taska().list.get(i);
        }
    }
}
