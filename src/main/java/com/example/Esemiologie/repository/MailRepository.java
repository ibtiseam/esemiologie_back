package com.example.Esemiologie.repository;

import com.example.Esemiologie.models.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository  extends JpaRepository<Mail,Long> {
}
