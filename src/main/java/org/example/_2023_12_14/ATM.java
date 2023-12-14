package org.example._2023_12_14;

import com.github.javafaker.Faker;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    private static final Faker FAKER = new Faker();
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        lock.lockInterruptibly();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(800);
            new Human(FAKER.name().fullName(), lock);
        }
    }
}

class Human extends Thread {
    private String name;
    private Lock lock;

    public Human(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            if(lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                try {
    //                System.out.println(name + "....waiting for....");
    //                lock.lock();
                    System.out.println(name + " is using ATM");
                    Thread.sleep(1500);
                    System.out.println(name + " finished!!");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(name + " went away((((");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}