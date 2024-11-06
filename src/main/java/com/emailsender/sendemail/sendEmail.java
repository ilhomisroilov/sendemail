package com.emailsender.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class sendEmail {

    @Autowired
    private JavaMailSender sender;
    public void send(String toEmailAdd, String Subject, String Message) {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setFrom("ilhomisroilov2106@gmail.com");
        smm.setTo(EmailForm.email);
        smm.setSubject(EmailForm.subject);
        smm.setText(EmailForm.msg);
        sender.send(smm);
    }
}
