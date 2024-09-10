package org.example.src.main.java;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import static org.example.src.main.java.VariaveisEnv.*;

public class ObjetoEnviaEmail {

    private String listaDestinatarios;
    private String nomeRemetente;
    private String assuntoEmail;
    private String conteudoEmail;

    public ObjetoEnviaEmail(String listaDestinatarios, String nomeRemetente, String assuntoEmail, String conteudoEmail) {
        this.listaDestinatarios = listaDestinatarios;
        this.nomeRemetente = nomeRemetente;
        this.assuntoEmail = assuntoEmail;
        this.conteudoEmail = conteudoEmail;
    }

    public void enviarEmail(boolean envioHtml) throws Exception {
        loadEnv();

        Properties props = new Properties();
        props.put("mail.smtp.ssl.trust", "*");
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

        Address[] toUser = InternetAddress.parse(listaDestinatarios);
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(userName(), nomeRemetente));
        message.setRecipients(Message.RecipientType.TO, toUser);
        message.setSubject(assuntoEmail);

        if (envioHtml) {
            message.setContent(conteudoEmail, "text/html; charset=utf-8");
        } else {
            message.setText(conteudoEmail);
        }

        Transport.send(message);
    }

    private FileInputStream simuladorPdf() throws Exception{
        Document document = new Document();
        File file = new File("fileanexo.pdf");
        file.createNewFile();
        PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        document.add(new Paragraph("Conteúdo do PDF anexo com java mail, esse texto é do PDF"));
        document.close();
        return new FileInputStream(file);
    }

}
