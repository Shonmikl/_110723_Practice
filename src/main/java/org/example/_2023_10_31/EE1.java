package org.example._2023_10_31;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EE1 {
//    public static int divide(int a, int b) {
//        if(b == 0) {
//            throw new DivideByZeroException(ExceptionMessage.ZERO);
//        }
//        return a / b;
//    }

    /**
     * @param a first param
     * @param b second param
     * @return result of dividing A and B
     * @throws DivideByZeroException if param 'b' is zero
     */
    public static int divide(int a, int b) throws DivideByZeroException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class ExceptionMessage {
    public static final String ZERO = "DIVIDING BY ZERO IS INCORRECT OPERATION";
}
