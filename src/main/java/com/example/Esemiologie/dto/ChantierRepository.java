package com.example.Esemiologie.dto;

import com.example.Esemiologie.model.Chantier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChantierRepository extends JpaRepository<Chantier, Long> {
    public Chantier findByName(String name);
}
