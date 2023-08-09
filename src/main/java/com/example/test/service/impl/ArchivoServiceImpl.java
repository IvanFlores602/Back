package com.example.test.service.impl;


import com.example.test.entity.Archivo;
import com.example.test.repository.ArchivoRepository;
import com.example.test.service.ArchivoService;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivoServiceImpl implements ArchivoService {
    private ArchivoRepository archivoRepository;

    @Autowired
    public ArchivoServiceImpl(ArchivoRepository archivoRepository) {
        this.archivoRepository = archivoRepository;
    }

    @Override
    public Archivo subirArchivo(byte[] contenido) {
        Archivo archivo = new Archivo();
        archivo.setContenido(contenido);
        archivo.setId(generarIdUnico());
        return archivoRepository.save(archivo);
    }


    @Override
    public Archivo obtenerArchivoPorId(Long id) {
        return archivoRepository.findById(id).orElse(null);
    }

    private Long generarIdUnico() {
        UUID uuid = UUID.randomUUID();
        long idUnico = uuid.getLeastSignificantBits() & Long.MAX_VALUE;
        return idUnico;
    }
}
