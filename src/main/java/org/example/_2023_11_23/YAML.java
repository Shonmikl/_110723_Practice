package org.example._2023_11_23;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public class YAML {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        InputStream inputStream = YAML.class.getClassLoader().getResourceAsStream("application.yml");

        if(inputStream == null) {
            System.out.println("Error///////");
            return;
        }

        try {
            Map<String, Object> o = yaml.load(inputStream);
            System.out.println(o);
        } catch (Exception e) {
            System.out.println("-------Error------" + e.getMessage());
        }
    }
}