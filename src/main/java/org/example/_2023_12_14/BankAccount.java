package org.example._2023_12_14;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        balance = balance + amount;
        lock.unlock();
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            balance = balance - amount;
        } finally {
            lock.unlock();
        }
    }
}

class AA {
    private String s;
    private String s1;
}
