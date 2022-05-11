package csf6.grupo04.Controller;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class EMAIL {
    private static final String username = "galanreyna00@gmail.com";
    private static final String password = "CSFcourse2022";

    public static void sendEmail(String email, String filePath){
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });


        MimeMessage message = new MimeMessage(session);
        try
        {
            Address addressTo = new InternetAddress(email);
            message.setRecipient(Message.RecipientType.TO, addressTo);
            message.setSubject("Student Management System");
            String msg = "Te saluda Student Management System, este es un mensaje de información sobre nuevo registro";

            Multipart content = new MimeMultipart();
            MimeBodyPart body = new MimeBodyPart();
            MimeBodyPart pdf = new MimeBodyPart();

            body.setContent(msg, "text/html; charset=utf-8");
            content.addBodyPart(body);

            File file = new File(filePath);
            pdf.attachFile(file);
            content.addBodyPart(pdf);

            message.setContent(content);
            Transport.send(message);
        }
        catch(MessagingException | IOException e)
        {
            e.printStackTrace();
            System.out.println("No se pudo enviar el mensaje");
        }
    }
}
