package com.example.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.entity.Tesp;
import com.example.test.repository.TespRepository;
import com.example.test.service.TespService;

//Implementación de TespService
@Service
public class TespServiceImpl implements TespService {
 private TespRepository tespRepository;

 public TespServiceImpl(TespRepository tespRepository) {
     this.tespRepository = tespRepository;
 }

 @Override
 public Tesp getById(Long id) {
     return tespRepository.findById(id)
             .orElseThrow(() -> new IllegalArgumentException("No se encontró el Tesp con ID: " + id));
 }

 @Override
 public List<Tesp> getAll() {
     return tespRepository.findAll();
 }

 @Override
 public void save(Tesp tesp) {
     tespRepository.save(tesp);
 }

 @Override
 public void update(Tesp tesp) {
     tespRepository.save(tesp);
 }

 @Override
 public void delete(Long id) {
     tespRepository.deleteById(id);
 }
}
