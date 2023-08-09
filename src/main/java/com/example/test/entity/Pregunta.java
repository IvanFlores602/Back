package com.example.test.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
@Data
@Entity
@Table(name = "pregunta")
public class Pregunta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ElementCollection
    @CollectionTable(name = "respuesta", joinColumns = @JoinColumn(name = "pregunta_id"))
    @Column(name = "texto")
    private List<String> respuestas;

    @ManyToOne
    @JoinColumn(name = "examen_id")
    @JsonBackReference("Examen-pregunta")
    private Examen examen;

    // Constructor por defecto
    public Pregunta() {
    }

    // Constructor con parámetros
    public Pregunta(String titulo, List<String> respuestas, Examen examen) {
        this.titulo = titulo;
        this.respuestas = respuestas;
        this.examen = examen;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<String> respuestas) {
		this.respuestas = respuestas;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	

}