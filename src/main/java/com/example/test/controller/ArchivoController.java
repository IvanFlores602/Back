package com.example.test.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.test.entity.Archivo;
import com.example.test.service.ArchivoService;

@RestController
@RequestMapping("/archivos")
public class ArchivoController {
    private ArchivoService archivoService;

    public ArchivoController(ArchivoService archivoService) {
        this.archivoService = archivoService;
    }

    @PostMapping
    public Archivo subirArchivo(@RequestParam("archivo") MultipartFile archivo) {
        try {
            byte[] contenido = archivo.getBytes();
            return archivoService.subirArchivo(contenido);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al subir el archivo");
        }
    }

    @GetMapping("/{id}")
    public Archivo obtenerArchivo(@PathVariable Long id) {
        return archivoService.obtenerArchivoPorId(id);
    }
}
