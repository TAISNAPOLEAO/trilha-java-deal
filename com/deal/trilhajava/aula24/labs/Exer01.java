package com.deal.trilhajava.aula24.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		VendeLampada lamp = new VendeLampada();
		
		lamp.marca = "Importado";
		lamp.potencia = 15;
		lamp.cor = "branca";
		lamp.equilavencia = "Fluorescente";
		lamp.modelo= "bulbo";
		lamp.base = "E27";
		lamp.voltagem = 110;
		lamp.vidaultil = 30000;
		lamp.anguloaberto = 360;
		lamp.valor = 9.90;
		
		System.out.println("Marca: " + lamp.marca);
		System.out.println("Potencia: " + lamp.potencia);
		System.out.println("Cor: " + lamp.cor);
		System.out.println("Equivalencia: " +lamp.equilavencia);
		System.out.println("Modelo: " + lamp.modelo);
		System.out.println("Base: " + lamp.base);
		System.out.println("Voltagem: " + lamp.voltagem);
		System.out.println("Vida Util: " + lamp.vidaultil);
		System.out.println("Angulo Aberto: " + lamp.anguloaberto);
		System.out.println("Valor: " + lamp.valor);
	}

}
