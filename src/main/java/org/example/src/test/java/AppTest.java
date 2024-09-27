package org.example.src.test.java;

import org.example.src.main.java.ObjetoEnviaEmail;

public class AppTest {

    @org.junit.Test
    public void testeEmail() throws Exception {
        StringBuilder stringBuilderTextoEmail = new StringBuilder();
        stringBuilderTextoEmail.append("Olá, <br/><br/>");
        stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso de Java.<br/><br/>");
        stringBuilderTextoEmail.append("Para ter acesso, clique no botão agora.<br/><br/>");
        stringBuilderTextoEmail.append("<b>Login:</b> edu<br/><br/>");
        stringBuilderTextoEmail.append("<b>Senha:</b> fdG5r3s@<br/><br/>");
        stringBuilderTextoEmail.append("<a " +
                "target=\"_blank\" " +
                "href=\"http://projetojavaweb.com/certificado-aluno/login\" " +
                "style=\"" +
                    "color: black; " +
                    "padding: 14px 25px;" +
                    "text-align: center;" +
                    "text-decoration: none;" +
                    "display: inline-block;" +
                    "border-radius: 30px;" +
                    "font-size: 20px;" +
                    "font-family: courier;" +
                    "border: 3px solid green;" +
                    "background-color: #99DA39" +
                "\">Acessar Portal" +
        "</a><br/><br/>");
        stringBuilderTextoEmail.append("<span style=\"font-size: 8px\">Ass.: Luiz</span><br/><br/>");
        ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail(
                "luizedumartins21@gmail.com",
                "Luiz",
                "Chegou o e-mail enviando com java",
                stringBuilderTextoEmail.toString()
        );
        enviaEmail.enviarEmailAnexo(true);
    }
}
