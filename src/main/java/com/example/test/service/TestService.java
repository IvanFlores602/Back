package com.example.test.service;

import java.util.List;
import java.util.Optional;

import com.example.test.entity.Test;

public interface TestService {
	Test guardarTest(Test test);

    void eliminarTest(Long id);

    Optional<Test> obtenerTestPorId(Long id);

    List<Test> obtenerTodosLosTests();
}