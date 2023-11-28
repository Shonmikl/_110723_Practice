package org.example._2023_11_28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LamHOME {
    public static void main(String[] args) {
       // System.out.println(square(num -> num * num));

        checkAndGet((t1, t2, t3) -> t1.length() + t2.length() + t3.length());
        checkAndGet((t1, t2, t3) -> (t1.length() + t2.length() + t3.length()) / 3);
        square(num -> num * num);
        square(num -> num * num * num);
        square(num -> Math.sqrt(Math.abs(num)));
        square(Math::sin);


        //todo
    //    checkAndGet();


    }

//    public static Double pi(Function<Double, Double> function) {
//
//    }

    public static Integer minStringLength(String s1, String s2, String s3) {
        return 0;
    }

    //x == y^2;
    public static double square(MathAble mathAble) {
        return mathAble.calc(11d);
    }

    public static Integer checkAndGet(ExecuteAble<Integer, String> executeAble) {
        String s1 = "mama";
        String s2 = "myla";
        String s3 = "ramu";
        return executeAble.execute(s1, s2, s3);
    }
}


interface MathAble {
    double calc(double num);
}

interface ExecuteAble<R, T> {
    R execute(T t1, T t2, T t3);
}