//package org.example._2023_11_23;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//public class JSON {
//    public static void main(String[] args) {
//        try {
//            InputStream inputStream = JSON.class.getResourceAsStream("ex.json");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//
//            StringBuilder stringBuilder = new StringBuilder();
//            String line = null;
//
//            while ((line = reader.readLine()) != null) {
//                stringBuilder.append(line);
//            }
//            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
