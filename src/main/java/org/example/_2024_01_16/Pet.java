package org.example._2024_01_16;

import org.springframework.stereotype.Component;

public interface Pet {
    void say();
}

@Component("dog")
class Dog implements Pet {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        System.out.println("Dog constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Dog set name");
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Dog say");
    }
}

@Component("cat")
class Cat implements Pet {

    private String name;

    public Cat() {
    }

    public Cat(String name) {
        System.out.println("Cat constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Cat set name");
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Cat say");
    }
}