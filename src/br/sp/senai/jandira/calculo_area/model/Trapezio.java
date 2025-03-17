package br.sp.senai.jandira.calculo_area.model;

public class Trapezio {
	private double baseMenor;
	private double baseMaior;
	private double Altura;
	
	public void setBaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setAltura (double altura) {
		this.Altura = altura;
	}
	
	public double getAltura() {
		return Altura;
	}
	
	public double calcularArea() {
		double area = (baseMenor + baseMaior) * Altura/2;
		return area;
	}
	
	public void mostrarDados() {
		double area = Math.round(calcularArea());
		System.out.println("=====================");
		System.out.println("trapézio");
		System.out.println("---------------------");
		System.out.printf("Base Menor: %s \n", baseMenor);
		System.out.printf("Base Maior: %s \n", baseMaior);
		System.out.printf("Altura: %s \n", Altura);
		System.out.printf("Área: %s \n", area);
	}
}
