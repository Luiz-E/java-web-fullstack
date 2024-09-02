package org.example.src.test.java;

import org.example.src.main.java.ObjetoEnviaEmail;

public class AppTest {

    @org.junit.Test
    public void testeEmail() throws Exception {
        ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail(
                "luizedumartins21@gmail.com",
                "Luiz",
                "Chegou o e-mail enviando com java",
                "Olá mundo"
        );
        enviaEmail.enviarEmail();
    }
}
