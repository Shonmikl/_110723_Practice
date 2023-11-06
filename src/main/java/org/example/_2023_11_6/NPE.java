package org.example._2023_11_6;

import java.io.FileReader;
import java.io.IOException;

public class NPE {

    public static void main(String[] args) throws IOException {
        FileReader reader = null; //32
        // null null null null
        reader.read();
    }
}
