package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Pregunta;
@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}