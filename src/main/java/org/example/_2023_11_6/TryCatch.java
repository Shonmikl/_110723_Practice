package org.example._2023_11_6;

import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("111.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (Exception e) {
            throw new NullPointerException();
        }
    }
}