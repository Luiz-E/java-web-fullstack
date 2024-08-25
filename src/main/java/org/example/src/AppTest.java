package org.example.src;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Authenticator;
import java.io.*;
import java.util.Properties;

public class AppTest {

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

    @org.junit.Test
    public void testeEmail() throws IOException {
        loadEnv(); // criado por questões de segurança
        try {
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

            Session session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(userName(),password());
                }
            });
            System.out.println(session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
