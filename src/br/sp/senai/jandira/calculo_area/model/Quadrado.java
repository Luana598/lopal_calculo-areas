package br.sp.senai.jandira.calculo_area.model;

public class Quadrado {
	private double lado;
	
	
	private void setLado (double lado) {
		this.lado = lado;
	}
	
	public double getLado () {
		return lado;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
		
	}

}

