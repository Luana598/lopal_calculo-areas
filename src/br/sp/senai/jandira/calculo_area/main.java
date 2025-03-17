package br.sp.senai.jandira.calculo_area;

import br.sp.senai.jandira.calculo_area.model.*;

public class main {
	
	public static void main(String[] args) {
		Retangulo formaR  = new Retangulo();
		
		formaR.setAltura(134);
		formaR.setBase(120);
		formaR.mostrarDados();
		
		Circunferencia formaC = new Circunferencia();
		
		formaC.setRaio(4);
		formaC.mostrarDados();
		
		Quadrado formaQ = new Quadrado();
		
		formaQ.setLado(10);
		formaQ.mostrarDados();
		
		Triangulo formaT = new Triangulo();
		
		formaT.setAltura(5);
		formaT.setBase(10);
		formaT.mostrarDados();
		
		Trapezio formaTr = new Trapezio();
		
		formaTr.setBaseMaior(5);
		formaTr.setBaseMenor(10);
		formaTr.setAltura(8);
		formaTr.mostrarDados();
	}

	
}
