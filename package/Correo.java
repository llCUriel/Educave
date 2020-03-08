package paquete;

import Fichero.LeeFichero;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Correo {

    public String Username;
    public String PassWord;
    public String Mensage;
    public String To;
    public String Subject;
    private Properties props;
    private Message message;
    private Session session;
    private LeeFichero fch;
    private String liga;

    public Correo(String Mensage, String Subject, String To) {
        this.Mensage = Mensage;
        this.Subject = Subject;
        this.To = To;
        fch = new LeeFichero();
        liga = "src/Fichero/correoP.txt";
        Username = fch.retornarUsuario(liga);
        PassWord = fch.retornarPas(liga);
    }

    public Correo() {
        liga = "src/Fichero/correoP.txt";
        fch = new LeeFichero();
        Username = fch.retornarUsuario(liga);
        PassWord = fch.retornarPas(liga);
        To = "dxmaniablogger@hotmail.com";
    }

    public void SendMail() {
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Username, PassWord);
            }
        });

        try {
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(Mensage);
            javax.mail.Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMensage(String Mensage) {
        this.Mensage = Mensage;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
}
