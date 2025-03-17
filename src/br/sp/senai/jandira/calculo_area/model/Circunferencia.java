package br.sp.senai.jandira.calculo_area.model;

public class Circunferencia {
	private double raio;
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area; 
	}
	
	public void mostrarDados() {
		double area = Math.round(calcularArea());
		System.out.println("=====================");
		System.out.println("circunferência");
		System.out.println("---------------------");
		System.out.printf("Raio: %s \n", raio);
		System.out.printf("Área: %s \n", area);
	}

}
