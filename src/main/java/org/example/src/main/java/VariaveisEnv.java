package org.example.src.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VariaveisEnv {
    public static void loadEnv() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/.env"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] keyValue = line.split("=");
                System.setProperty(keyValue[0].trim(), keyValue[1].trim());
            }
        }
    }
    public static String userName() {
        return System.getProperty("userName");
    }
    public static String password() {
        return System.getProperty("password");
    }
}
