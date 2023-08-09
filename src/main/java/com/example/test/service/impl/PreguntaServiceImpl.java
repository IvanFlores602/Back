package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Pregunta;
import com.example.test.repository.PreguntaRepository;
import com.example.test.service.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    private final PreguntaRepository preguntaRepository;

    @Autowired
    public PreguntaServiceImpl(PreguntaRepository preguntaRepository) {
        this.preguntaRepository = preguntaRepository;
    }

    @Override
    public List<Pregunta> obtenerTodasLasPreguntas() {
        return preguntaRepository.findAll();
    }

    @Override
    public Pregunta obtenerPreguntaPorId(Long id) {
        return preguntaRepository.findById(id).orElse(null);
    }

    @Override
    public Pregunta guardarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public void eliminarPregunta(Long id) {
        preguntaRepository.deleteById(id);
    }
}
