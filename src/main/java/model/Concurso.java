package model;

import java.util.*;

public class Concurso {

	private Cuadro cuadro;
	private int puntuacion;
	private boolean puntuado;
	
	List<Visitante> visitantes;
	
	public Concurso(Cuadro cuadro, int puntuacion, boolean puntuado) {
		super();
		this.cuadro = cuadro;
		this.puntuacion = puntuacion;
		this.puntuado = puntuado;
		
		visitantes = new ArrayList<>();
	}

	public Cuadro getCuadro() {
		return cuadro;
	}
	
	public void setCuadro(Cuadro cuadro) {
		this.cuadro = cuadro;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public boolean isPuntuado() {
		return puntuado;
	}
	
	public void setPuntuado(boolean puntuado) {
		this.puntuado = puntuado;
	}
	
	
}
