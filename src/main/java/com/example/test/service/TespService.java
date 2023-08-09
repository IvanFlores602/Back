package com.example.test.service;

import java.util.List;

import com.example.test.entity.Tesp;

//Interfaz TespService
public interface TespService {
 Tesp getById(Long id);
 List<Tesp> getAll();
 void save(Tesp tesp);
 void update(Tesp tesp);
 void delete(Long id);
}
