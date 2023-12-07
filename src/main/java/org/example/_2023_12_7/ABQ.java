package org.example._2023_12_7;

import com.github.javafaker.Faker;
import com.github.javafaker.Food;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ABQ {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        ArrayBlockingQueue<Order> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(() -> {
            Order[] orders = new Order[15];
            for (int i = 0; i < orders.length; i++) {
                orders[i] = new Order(FAKER.food().dish(), RANDOM.nextInt(100), RANDOM.nextInt(2000));
            }

            for (int i = 0; i < orders.length && !Thread.interrupted(); i++) {
                try {
                    Thread.sleep(orders[i].getTimeToReady());
                    queue.put(orders[i]);

                    System.out.println("Client was ordered: " + orders[i]);
                    System.out.println("[Order's numbers is: " + queue.size() + "]");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(5000);
                    System.out.println(queue.take() + " *** DONE ***");
                    System.out.println("[Order's numbers is: " + queue.size() + "]");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

class Order {
    private String name;
    private double price;
    private int timeToReady;

    public Order(String name, double price, int timeToReady) {
        this.name = name;
        this.price = price;
        this.timeToReady = timeToReady;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTimeToReady() {
        return timeToReady;
    }

    public void setTimeToReady(int timeToReady) {
        this.timeToReady = timeToReady;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Double.compare(price, order.price) == 0 && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}