package com.example.Esemiologie.security.services;


import com.example.Esemiologie.models.Mail;
import com.example.Esemiologie.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class SendMail {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    MailRepository repository;
    public long sendMail(Mail mail) throws MailException {
        System.out.println("send email...");
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail.getDestinataire());
        msg.setFrom("azplatre21@gmail.com");
        msg.setSubject(mail.getObjet());
        msg.setText(mail.getMessage());
        javaMailSender.send(msg);
        return repository.save(mail)
                .getId();
    }


}
