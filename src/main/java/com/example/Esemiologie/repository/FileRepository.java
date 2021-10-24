package com.example.Esemiologie.repository;

import com.example.Esemiologie.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FileRepository extends JpaRepository<FileModel, Long>{
    public FileModel findByName(String name);
}
