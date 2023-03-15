package com.deal.trilhajava.aula27.labs;

public class Lampada {
	
	String marca;
	int potencia;
	String cor;
	String equilavencia;
	String modelo;
	String base;
	int voltagem;
	int vidaultil;
	int anguloaberto;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
		//System.out.println("Ligada");
	}
	
	void desligar() {
		ligada = false;
		//System.out.println("Desligada");
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lampada está ligada");
		}else {
			System.out.println("Lampada está desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
}
