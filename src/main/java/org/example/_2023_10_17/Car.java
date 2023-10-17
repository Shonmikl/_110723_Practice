package org.example._2023_10_17;

import java.util.Objects;

public class Car {
    private String name;
    private int horsePower;

    /**
     * == ссылка
     * equals значение
     * instance of types
     */

    @Override
    // o1.equals(o2)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() { //цифровое представление объекта
        return Objects.hash(name, horsePower);
    }
}
