package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.test.entity.Examen;
import com.example.test.entity.Pregunta;
import com.example.test.service.ExamenService;

import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenController {

    private final ExamenService examenService;

    @Autowired
    public ExamenController(ExamenService examenService) {
        this.examenService = examenService;
    }

    @GetMapping
    public List<Examen> obtenerTodosLosExamenes() {
        return examenService.obtenerTodosLosExamenes();
    }

    @GetMapping("/{id}")
    public Examen obtenerExamenPorId(@PathVariable Long id) {
        return examenService.obtenerExamenPorId(id);
    }

    @PostMapping
    public Examen crearExamen(@RequestBody Examen examen) {
        // Asignar las respuestas a cada pregunta
        for (Pregunta pregunta : examen.getPreguntas()) {
            pregunta.setExamen(examen);
        }

        return examenService.guardarExamen(examen);
    }

    @PutMapping("/{id}")
    public Examen actualizarExamen(@PathVariable Long id, @RequestBody Examen examen) {
        Examen examenExistente = examenService.obtenerExamenPorId(id);
        if (examenExistente != null) {
            examenExistente.setNombre(examen.getNombre());
            // Aquí puedes manejar otros atributos del examen que desees actualizar
            return examenService.guardarExamen(examenExistente);
        } else {
            // Manejo de error cuando no se encuentra el examen con el ID especificado
            // Puedes lanzar una excepción, retornar un ResponseEntity con el código de error, etc.
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarExamen(@PathVariable Long id) {
        examenService.eliminarExamen(id);
    }
}
