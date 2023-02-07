package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Calculo de Media de NOtas");
		
		
		System.out.print("Informe quantas medias Calcular:");
		double notas = scan.nextDouble();
		
		double soma = 0; 
		double media = soma/notas;
		double nota;
		
		
		for(int i=0; i<notas; i++) {		
			
			System.out.println("Informe a nota: " + (i+1));
			nota = scan.nextDouble();
			
			soma = soma + nota;
			media = soma / notas;
		}
		
			
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

	}

}
