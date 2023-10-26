package org.example._2023_10_26;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
