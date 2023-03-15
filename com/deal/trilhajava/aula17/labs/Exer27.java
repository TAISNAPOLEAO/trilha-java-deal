package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Meteorologia");
		System.out.println();
		
		System.out.print("Informe a quantidade de temperaturas:");
		int conjTemperaturas = scan.nextInt();
		
		System.out.println();
		
		int soma=0;
		int temperatura=0;
		int menor = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int media =0;
		
		for(int i=1; i<=conjTemperaturas; i++) {
			
			System.out.print("Informe a Temperatura " + i + ": ");
			temperatura = scan.nextInt();
			
			soma = soma + temperatura;
			media = soma / conjTemperaturas;
			
			if(temperatura > max) {
				max = temperatura;
			}
			
			if(temperatura < menor) {
				menor = temperatura;
			}
		
		}
		System.out.println();
		System.out.println("Soma das Temperaturas: " + soma);
		System.out.println("Media das Temperaturas: " + media);
		System.out.println("Menor das Temperaturas: " + menor);
		System.out.println("Maior das Temperaturas: " + max);
		
	}

}
