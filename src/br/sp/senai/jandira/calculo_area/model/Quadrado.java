package br.sp.senai.jandira.calculo_area.model;

public class Quadrado {
	private double lado;
	
	
	public void setLado (double lado) {
		this.lado = lado;
	}
	
	public double getLado () {
		return lado;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public double calcularArea() {
		double area = lado*lado;
		return area;
	}
	public void mostrarDados () {
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		System.out.println("======================");
		System.out.println("quadrado");
		System.out.println("-----------------------");
		System.out.printf("Lado: %s \n", lado);
		System.out.printf("Perimetro:%s \n", perimetro);
		System.out.printf("Area:%s \n", area);
	}

}

