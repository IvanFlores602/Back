package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Examen;
@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}
