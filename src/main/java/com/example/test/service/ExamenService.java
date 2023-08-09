package com.example.test.service;

import java.util.List;

import com.example.test.entity.Examen;

public interface ExamenService {
    List<Examen> obtenerTodosLosExamenes();
    Examen obtenerExamenPorId(Long id);
    Examen guardarExamen(Examen examen);
    void eliminarExamen(Long id);
}
