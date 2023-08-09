package com.example.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.test.entity.Test;
import com.example.test.service.TestService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public ResponseEntity<Test> guardarTest(@RequestBody Test test) {
        Test nuevoTest = testService.guardarTest(test);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Test> obtenerTestPorId(@PathVariable Long id) {
        Optional<Test> test = testService.obtenerTestPorId(id);
        return test.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Test>> obtenerTodosLosTests() {
        List<Test> tests = testService.obtenerTodosLosTests();
        return ResponseEntity.ok(tests);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTest(@PathVariable Long id) {
        testService.eliminarTest(id);
        return ResponseEntity.noContent().build();
    }

    // Otros métodos del controlador si es necesario
	
}
