package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculo de Fatorial");
		
		System.out.println("Informe o Numero a ser Fatorado:");
		int numero = scan.nextInt();
		
		int fatorial = 1;
		for(int i=numero; i>1; i--) {

			fatorial = fatorial * i;
			
			System.out.println("Fatorial: " + fatorial);
			
		}
		
	}

}
