package org.example._2023_10_24;

import com.github.javafaker.Faker;

import java.util.*;

public class ComEx {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
//        List<Player> players = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            players.add(new Player(FAKER.name().name(), RANDOM.nextInt(50)));
//        }
//        System.out.println(players);
//
//        Collections.sort(players, new PlayerSalaryComparator());
//        System.out.println(players);

        Set<Player> players = new TreeSet<>(new PlayerSalaryComparator());
        for (int i = 0; i < 5; i++) {
            players.add(new Player(FAKER.name().name(), RANDOM.nextInt(50)));
        }

        System.out.println(players);
    }
}

class Player implements Comparable<Player> {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        return this.name.compareTo(o.name);
    }
}

class PlayerSalaryComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getAge() - o2.getAge();
    }
}