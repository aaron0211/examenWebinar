package com.aaron.examen.examenWebinar2Evaluacion;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

import model.Concurso;
import model.Cuadro;
import model.Visitante;


public class ConcursoTest {

	Cuadro cuadro = new Cuadro("Nuevo Guernica","Oleo" , 100, 20);
	Concurso concurso = new Concurso();
	Visitante visitante1 = new Visitante("nuevoVisitante","contrasena");
	Visitante visitante2 = new Visitante("otro","sin");
	List<Visitante> visitantes = new ArrayList<>();
	
	@Test
	public void Puntuar() {
		int puntos=4;
		visitantes.add(visitante1);
		System.out.println(visitantes.toString());
		if(!visitantes.contains(visitante1)) {
			System.out.println("Debes de registarte para poder puntuar");
		}else {
			if(puntos<0 || puntos>5) {
				System.out.println("Tienes que puntuar de 0 a 5");
			}else {
				int pTotales = cuadro.getPuntuacionTotal()+puntos;
				this.cuadro.setPuntuacionTotal(pTotales);
			}
		}
		assertEquals(4,cuadro.getPuntuacionTotal());
	}
	
}
