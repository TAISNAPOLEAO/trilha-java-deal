package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
 
		System.out.println("Informe um numero: ");
		int numero = scan.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i<numero; i++) {
			
			if(numero % i == 0) {
				
				System.out.println("Não é primo - divisivel por: " + i );
				primo = false;
			}
			
			
		}
		
		if(primo) {
			
			System.out.println("É primo");
			
		}
		

	}

}
