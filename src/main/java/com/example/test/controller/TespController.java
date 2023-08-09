package com.example.test.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.Tesp;
import com.example.test.service.TespService;

//Clase TespController
@RestController
@RequestMapping("/tesp")
public class TespController {
 private TespService tespService;

 public TespController(TespService tespService) {
     this.tespService = tespService;
 }

 @GetMapping("/{id}")
 public ResponseEntity<Tesp> getById(@PathVariable Long id) {
     Tesp tesp = tespService.getById(id);
     return ResponseEntity.ok(tesp);
 }

 @GetMapping
 public ResponseEntity<List<Tesp>> getAll() {
     List<Tesp> tespList = tespService.getAll();
     return ResponseEntity.ok(tespList);
 }

 @PostMapping
 public ResponseEntity<Void> createTesp(@RequestBody Tesp tesp) {
     tespService.save(tesp);
     return ResponseEntity.status(HttpStatus.CREATED).build();
 }

 @PutMapping("/{id}")
 public ResponseEntity<Void> updateTesp(@PathVariable Long id, @RequestBody Tesp tesp) {
     tesp.setId(id);
     tespService.update(tesp);
     return ResponseEntity.ok().build();
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteTesp(@PathVariable Long id) {
     tespService.delete(id);
     return ResponseEntity.ok().build();
 }
}
