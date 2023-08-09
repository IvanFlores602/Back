package com.example.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Cuestionario;
import com.example.test.service.CuestionarioService;

@RestController
@RequestMapping("/cuestionarios")
public class CuestionarioController {
    private final CuestionarioService cuestionarioService;

    public CuestionarioController(CuestionarioService cuestionarioService) {
        this.cuestionarioService = cuestionarioService;
    }

    @PostMapping
    public ResponseEntity<Cuestionario> crearCuestionario(@RequestBody Cuestionario cuestionario) {
        Cuestionario nuevoCuestionario = cuestionarioService.guardarCuestionario(cuestionario);
        return ResponseEntity.ok(nuevoCuestionario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuestionario> obtenerCuestionarioPorId(@PathVariable Long id) {
        Cuestionario cuestionario = cuestionarioService.obtenerCuestionarioPorId(id);
        if (cuestionario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cuestionario);
    }

    @GetMapping
    public ResponseEntity<List<Cuestionario>> obtenerTodosLosCuestionarios() {
        List<Cuestionario> cuestionarios = cuestionarioService.obtenerTodosLosCuestionarios();
        return ResponseEntity.ok(cuestionarios);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCuestionario(@PathVariable Long id) {
        Cuestionario cuestionario = cuestionarioService.obtenerCuestionarioPorId(id);
        if (cuestionario == null) {
            return ResponseEntity.notFound().build();
        }
        cuestionarioService.eliminarCuestionario(id);
        return ResponseEntity.noContent().build();
    }
}
