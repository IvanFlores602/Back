package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.test.entity.Pregunta;
import com.example.test.service.PreguntaService;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {

    private final PreguntaService preguntaService;

    @Autowired
    public PreguntaController(PreguntaService preguntaService) {
        this.preguntaService = preguntaService;
    }

    @GetMapping
    public List<Pregunta> obtenerTodasLasPreguntas() {
        return preguntaService.obtenerTodasLasPreguntas();
    }

    @GetMapping("/{id}")
    public Pregunta obtenerPreguntaPorId(@PathVariable Long id) {
        return preguntaService.obtenerPreguntaPorId(id);
    }

    @PostMapping
    public Pregunta guardarPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.guardarPregunta(pregunta);
    }

    

    @DeleteMapping("/{id}")
    public void eliminarPregunta(@PathVariable Long id) {
        preguntaService.eliminarPregunta(id);
    }
}
