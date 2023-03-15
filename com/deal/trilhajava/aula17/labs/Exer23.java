package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
			
		System.out.println("Loja Quase Dois - Tabela de Preços");
		System.out.println();
		
		for(double i=1; i<=50; i++) {
			
			double total = 1.99 * i;
			System.out.println(i + " - R$ " + total);
			
		}
		

	}

}
