package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sequencia de Fibonnacci : ");
		int n=scan.nextInt();
		
		int soma1=1;
		int soma2=1;
		int proximo;
		
		System.out.println("Primeiro numero: " + soma1);
		System.out.println("Segundo numero: " + soma2);
		
		
		for(int i=3; i<=n; i++) {
			System.out.println();
			//System.out.print("I: " + i );
			
			proximo = soma1 + soma2;
			soma1 = soma2;
			soma2 = proximo;
			
			
			System.out.print("Sequencia: " + proximo);
		}

	}

}
