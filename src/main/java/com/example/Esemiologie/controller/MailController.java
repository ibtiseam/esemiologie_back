package com.example.Esemiologie.controller;


import com.example.Esemiologie.models.Mail;
import com.example.Esemiologie.security.services.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MailController {
    @Autowired
    private SendMail service;
    @PostMapping("/mails")
    public long save(@RequestBody Mail mail){
        System.out.println("send mail");
        return service.sendMail(mail);
    }
}
