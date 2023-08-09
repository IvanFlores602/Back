package com.example.test.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Test;
import com.example.test.repository.TestRepository;
import com.example.test.service.TestService;

import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

	private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test guardarTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public void eliminarTest(Long id) {
        testRepository.deleteById(id);
    }

    @Override
    public Optional<Test> obtenerTestPorId(Long id) {
        return testRepository.findById(id);
    }

    @Override
    public List<Test> obtenerTodosLosTests() {
        return testRepository.findAll();
    }
	}
