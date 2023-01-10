package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostre se o valor é positivo ou negativo");
		
		System.out.println("Informe o numero 1: ");
		int numero1 = scan.nextInt();
	
		if(numero1 < 0) {
			
			System.out.println("Numero Negativo");
		} else {
			
			System.out.println("Numero Positivo");
		}

	}

}
