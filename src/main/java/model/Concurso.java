package model;

import java.util.*;

public class Concurso {

	private Cuadro cuadro;
	
	List<Visitante> visitantes;
	
	public void Puntuar(Visitante visitante,Cuadro cuadro,int puntos) {
		if(!visitantes.contains(visitante)) {
			System.out.println("Debes de registarte para poder puntuar");
		}
		if(puntos<0 || puntos>5) {
			System.out.println("Tienes que puntuar de 0 a 5");
		}else {
			int pTotales = cuadro.getPuntuacionTotal()+puntos;
			this.cuadro.setPuntuacionTotal(pTotales);
		}
	}
}
