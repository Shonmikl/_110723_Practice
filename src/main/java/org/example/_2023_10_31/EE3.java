package org.example._2023_10_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EE3 {
    private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter 16 digit of your card: .....");
            try {
                String digit = READER.readLine();
                //
                System.out.println("CARD NUMBER IS: " + digit);
                //
                break;
            } catch (IOException e) {
                System.out.println("DIGIT IS NOT VALID");
            }
        }

        System.out.println("***Card number is correct***");
        try {
            READER.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}