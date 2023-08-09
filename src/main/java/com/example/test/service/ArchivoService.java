package com.example.test.service;

import com.example.test.entity.Archivo;

public interface ArchivoService {
    Archivo subirArchivo( byte[] contenido);
    Archivo obtenerArchivoPorId(Long id);
}