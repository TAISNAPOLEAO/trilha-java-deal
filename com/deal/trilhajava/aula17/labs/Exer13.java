package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*errado
		 * System.out.println("Informe o numero base:");
		int base = scan.nextInt();
		
		System.out.println("Informe o numero expoente:");
		int expoente = scan.nextInt();
		
		int potencia = base ^ expoente;
		
		System.out.println("Potencia: " + potencia);*/
		
		System.out.println("Informe o numero base:");
		int base = scan.nextInt();
		
		System.out.println("Informe o numero expoente:");
		int pot = scan.nextInt();
		
		int resultado=base;
		
		for(int i=1; i<pot; i++) {
			resultado *= base;
			
		}
		System.out.println("Resultado = " + resultado);
		
		
		

	}

}
