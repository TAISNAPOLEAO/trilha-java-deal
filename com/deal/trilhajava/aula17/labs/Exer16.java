package com.deal.trilhajava.aula17.labs;

public class Exer16 {

	public static void main(String[] args) {
		
		
		
		int soma1=1;
		int soma2=1;
		int proximo=0;
		
		System.out.println("Primeiro numero: " + soma1);
		System.out.println("Segundo numero: " + soma2);
		
		
		while(proximo<= 500) {
			System.out.println();
			
			
			proximo = soma1 + soma2;
			soma1 = soma2;
			soma2 = proximo;
			
			
			System.out.print("Sequencia: " + proximo);
			}

	}

}
