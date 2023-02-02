package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numeros;
		int pares= 0;
		int impares=0;

		for(int i=0; i<10; i++) {
			
			System.out.print("Entre com Numero:");
			numeros = scan.nextInt();
			
			if(numeros %2 == 0) {
				
				pares++;
			
			}else {
				
				impares++;
				
			}
			
		}
		System.out.println();
		System.out.print("Pares = " + pares);
		
		System.out.println();
		System.out.print("Impares = " + impares);
		

	}

}
