package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		System.out.println("Minimo: " + min);
		System.out.println("Maximo: " + max);
		
		*/
		
		int min = Integer.MIN_VALUE;
		
		for(int i = 0; i <5; i++) {
			
			System.out.println("Inform cinco numeros: ");
			int numero = scan.nextInt();
			
			if(numero > min) {
				min = numero;
				
			}
			
		}
		
		System.out.println("O Maior numero é: " + min);
	}

}
