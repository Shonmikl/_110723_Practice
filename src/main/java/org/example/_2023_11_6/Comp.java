package org.example._2023_11_6;

import com.github.javafaker.Faker;

import java.io.Serializable;
import java.util.*;

public class Comp {

    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static void test(Runnable runnable) {
        System.out.println("))))");
    }

    public static void main(String[] args) {
        List<Dog> dogSet = new ArrayList<>();
        dogSet.add(new Dog(FAKER.name().name(), RANDOM.nextInt(15)));
        dogSet.add(new Dog(FAKER.name().name(), RANDOM.nextInt(15)));
        dogSet.add(new Dog(FAKER.name().name(), RANDOM.nextInt(15)));
        dogSet.add(new Dog(FAKER.name().name(), RANDOM.nextInt(15)));
        dogSet.add(new Dog(FAKER.name().name(), RANDOM.nextInt(15)));

        System.out.println(dogSet);
        System.out.println("-------------------------------------------");
        Collections.sort(dogSet, new DogNameComparator());
        System.out.println(dogSet);
    }
}

class Dog implements Comparable<Dog>, Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }
}

class DogNameComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
