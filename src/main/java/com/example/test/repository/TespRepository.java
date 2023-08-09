package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Tesp;

@Repository
public interface TespRepository extends JpaRepository<Tesp, Long> {
    // Definición de consultas personalizadas si es necesario
}
