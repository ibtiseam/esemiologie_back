package com.example.Esemiologie.repository;

import com.example.Esemiologie.models.Devis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevisRepository extends JpaRepository<Devis, Long> {


        List<Devis> findBysujetContaining(String sujet);
        }
