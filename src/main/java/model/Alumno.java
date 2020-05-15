package model;

import java.time.LocalDate;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String curso;
	private String email;
	private LocalDate f_nac;
	
	public Alumno(String nombre, String apellidos, String curso, String email, LocalDate f_nac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.email = email;
		this.f_nac = f_nac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getF_nac() {
		return f_nac;
	}

	public void setF_nac(LocalDate f_nac) {
		this.f_nac = f_nac;
	}
}
