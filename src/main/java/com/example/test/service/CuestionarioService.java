package com.example.test.service;

import java.util.List;

import com.example.test.entity.Cuestionario;

public interface CuestionarioService {
	Cuestionario guardarCuestionario(Cuestionario cuestionario);
    Cuestionario obtenerCuestionarioPorId(Long id);
    List<Cuestionario> obtenerTodosLosCuestionarios();
    void eliminarCuestionario(Long id);
}	
