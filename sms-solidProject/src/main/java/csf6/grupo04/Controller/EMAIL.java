package csf6.grupo04.Controller;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class EMAIL {
    public static void sendEmail(String email){
        final String username = "galanreyna00@gmail.com";
        final String password = "CSFcourse2022";
        String from = "galanreyna00@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("galanreyna00@gmail.com", "CSFcourse2022");
            }
        });


        MimeMessage message = new MimeMessage(session);
        try
        {
            Address addressTo = new InternetAddress(email);
            message.setRecipient(Message.RecipientType.TO, addressTo);
            message.setSubject("Student Management System");

            Multipart content = new MimeMultipart();
            MimeBodyPart pdf = new MimeBodyPart();

            File file = new File("info.pdf");
            pdf.attachFile(file);
            content.addBodyPart(pdf);

            message.setContent(content);
            Transport.send(message);
            System.out.println("Enviado");
        }
        catch(MessagingException e)
        {
            e.printStackTrace();
            System.out.println("No se pudo enviar el mensaje");
        }

        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("No se pudo enviar el mensaje");
        }
    }
}
