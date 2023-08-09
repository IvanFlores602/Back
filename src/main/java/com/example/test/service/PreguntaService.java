package com.example.test.service;

import java.util.List;

import com.example.test.entity.Pregunta;

public interface PreguntaService {
    List<Pregunta> obtenerTodasLasPreguntas();
    Pregunta obtenerPreguntaPorId(Long id);
    Pregunta guardarPregunta(Pregunta pregunta);
    void eliminarPregunta(Long id);
}
