package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Examen;
import com.example.test.repository.ExamenRepository;
import com.example.test.service.ExamenService;

@Service
public class ExamenServiceImpl implements ExamenService {

    private final ExamenRepository examenRepository;

    @Autowired
    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public List<Examen> obtenerTodosLosExamenes() {
        return examenRepository.findAll();
    }

    @Override
    public Examen obtenerExamenPorId(Long id) {
        return examenRepository.findById(id).orElse(null);
    }

    @Override
    public Examen guardarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public void eliminarExamen(Long id) {
        examenRepository.deleteById(id);
    }
}
