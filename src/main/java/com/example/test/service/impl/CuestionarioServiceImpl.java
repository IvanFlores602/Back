package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Cuestionario;
import com.example.test.repository.CuestionarioRepository;
import com.example.test.service.CuestionarioService;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {
    private final CuestionarioRepository cuestionarioRepository;

    public CuestionarioServiceImpl(CuestionarioRepository cuestionarioRepository) {
        this.cuestionarioRepository = cuestionarioRepository;
    }

    @Override
    public Cuestionario guardarCuestionario(Cuestionario cuestionario) {
        return cuestionarioRepository.save(cuestionario);
    }

    @Override
    public Cuestionario obtenerCuestionarioPorId(Long id) {
        return cuestionarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cuestionario> obtenerTodosLosCuestionarios() {
        return cuestionarioRepository.findAll();
    }

    @Override
    public void eliminarCuestionario(Long id) {
        cuestionarioRepository.deleteById(id);
    }
}
