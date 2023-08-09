package com.example.test.entity;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "correo_electronico", nullable = false)
    private String correoElectronico;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    @Column(name = "genero", nullable = false)
    private String genero;
    @Column(name = "edad", nullable = false)
    private Long edad;
    @Column(name = "telefono", nullable = false)
    private Long telefono;
    @Column(name = "ocupacion", nullable = false)
    private String ocupacion;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("usuario-tesp")
    private List<Tesp> tespList = new ArrayList<>();
    //metodos auxiliares
    public void addTesp(Tesp tesp) {
        tespList.add(tesp);
        tesp.setUsuario(this);
    }

    public void removeTesp(Tesp tesp) {
        tespList.remove(tesp);
        tesp.setUsuario(null);
    }
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("usuario-test")
    private List<Test> testList = new ArrayList<>();
    
    // métodos auxiliares para la relación
    public void addTest(Test test) {
        testList.add(test);
        test.setUsuario(this);
    }

    public void removeTest(Test test) {
        testList.remove(test);
        test.setUsuario(null);
    }
    
 // En el modelo Usuario, agrega el campo y los métodos auxiliares
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("usuario-archivo")
    private List<Archivo> archivos = new ArrayList<>();

    // Métodos auxiliares para la relación
    public void addArchivo(Archivo archivo) {
        archivos.add(archivo);
        archivo.setUsuario(this);
    }

    public void removeArchivo(Archivo archivo) {
        archivos.remove(archivo);
        archivo.setUsuario(null);
    }
    
    public Usuario() {
	}

	public Usuario(Long idUsuario,String nombre,String apellido,String correoElectronico,String contrasena,
			String genero, Long edad, Long telefono, String ocupacion) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.genero = genero;
		this.edad = edad;
		this.telefono = telefono;
		this.ocupacion = ocupacion;
		
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public List<Tesp> getTespList() {
		return tespList;
	}

	public void setTespList(List<Tesp> tespList) {
		this.tespList = tespList;
	}

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public List<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<Archivo> archivos) {
		this.archivos = archivos;
	}
	
}


