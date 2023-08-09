package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

//Clase Tesp
@Data
@Entity
@Table(name = "tesp")
public class Tesp {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id", nullable = false)
 private Long id;
 @Column(name = "nombreTest", nullable = false)
 private String nombreTest;
 @Column(name = "puntaje", nullable = false)
 private int puntaje;
 @Column(name = "descripcion", nullable = false)
 private String descripcion;
 
 @ManyToOne
 @JoinColumn(name = "id_usuario")
 @JsonBackReference("usuario-tesp")
 private Usuario usuario;

 // Constructor vacío (requerido por JPA)
 public Tesp() {}

 // Constructor
 public Tesp(String nombreTest, int puntaje, String descripcion) {
     this.nombreTest = nombreTest;
     this.puntaje = puntaje;
     this.descripcion = descripcion;
 }

 // Getters y setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getNombreTest() {
     return nombreTest;
 }

 public void setNombreTest(String nombreTest) {
     this.nombreTest = nombreTest;
 }

 public int getPuntaje() {
     return puntaje;
 }

 public void setPuntaje(int puntaje) {
     this.puntaje = puntaje;
 }

 public String getDescripcion() {
     return descripcion;
 }

 public void setDescripcion(String descripcion) {
     this.descripcion = descripcion;
 }

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

}
