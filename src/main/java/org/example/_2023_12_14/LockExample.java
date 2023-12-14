package org.example._2023_12_14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread T1mobile = new Thread(call::mobileCall);
        Thread T2skype = new Thread(call::skypeCall);
        Thread T3wa = new Thread(call::waCall);

        T1mobile.start();
        T2skype.start();
        T3wa.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call start...");
            Thread.sleep(1500);
            System.out.println("Mobile call end****");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
//            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call start...");
            Thread.sleep(2000);
            System.out.println("Skype call end****");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void waCall() {
        lock.lock();
        try {
            System.out.println("WA call start...");
            Thread.sleep(2200);
            System.out.println("WA call end****");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}