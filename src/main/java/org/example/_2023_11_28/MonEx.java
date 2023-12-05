package org.example._2023_11_28;

public class MonEx {
    private final Object LOCK = new Object();
    static int money;
    public synchronized void deposit(int amount) {
        synchronized (LOCK) {
            MonEx.money += amount;
        }
    }

    public void withdraw(int amount) {
        synchronized (LOCK) {
            MonEx.money -= amount;
        }
    }
}
