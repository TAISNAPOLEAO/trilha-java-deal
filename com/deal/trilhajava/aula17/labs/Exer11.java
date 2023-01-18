package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma = 0;
		
		System.out.println("Informe o Numero 1: ");
		numero1 = scan.nextInt();
		
		System.out.println("Informe o Numero 2: ");
		numero2 = scan.nextInt();
		
		for(int i= numero1; i <= numero2; i++) {
			
			System.out.print(" " + i);
			
			soma = soma + i;
			
		}
		System.out.println();
		System.out.println("Soma: " + soma);
	}

}
