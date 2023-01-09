package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Impressão do Maior Numero");
		
		System.out.println("Informe o numero 1: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o numero 2: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			
			System.out.println("Numero 1 é maior que o Numero 2");
		
		} else if(numero1 < numero2)
			
			System.out.println("Numero 2 é maior que o Numero 1");
	}

}
