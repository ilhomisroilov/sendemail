package com.emailsender.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class SendemailApplication {
	@Autowired
	private sendEmail senderServices;

            

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {

            senderServices.send(EmailForm.email, EmailForm.subject, EmailForm.msg);
	
        }
}
