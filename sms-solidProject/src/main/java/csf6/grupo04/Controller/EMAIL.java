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

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);
        properties.put("mail.transport.protocol", "smtp");

        Session session = Session.getInstance(properties, new Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentcation()
            {
                return new PasswordAuthentication(username, password);
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
