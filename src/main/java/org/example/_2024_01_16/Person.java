package org.example._2024_01_16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    private String name;
    private int age;
    private Pet pet;

    public Person() {
    }

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Set name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet( Pet pet) {
        System.out.println("Set Pet");
        this.pet = pet;
    }
}
