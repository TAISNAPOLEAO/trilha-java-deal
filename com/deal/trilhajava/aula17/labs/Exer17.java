package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o Numero para Fatorar: ");
		int numero =  scan.nextInt();
		
		int fatorial = 1;
		for(int i = numero; i > 0; i--) {
			
			fatorial = fatorial * i;
			
			System.out.println("Fatorial de: " + fatorial + "é: " + fatorial);
			 
		}
		
		

	}

}
