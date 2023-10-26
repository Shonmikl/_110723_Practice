package org.example._2023_10_26;

public class Info<T> {
//    public static T ttt;
    private T value;

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Info<String> info = new Info<>();
        Info<Integer> integerInfo = new Info<>();

        info.getValue();
        integerInfo.getValue();
    }
}
