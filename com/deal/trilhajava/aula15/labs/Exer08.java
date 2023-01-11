package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		// Faça um programa que pergunte o preço de três produtos e informe
		//qual produto você deve comprar, sabendo que a decisão é sempre
		//pelo mais barato.
				
				
				Scanner scan = new Scanner(System.in);
				
				
				System.out.println("Escolha o Produto Mais Barato");
				
				System.out.println();
				System.out.print("Entre com o valor do Primeiro Produto: ");
				double preco1 = scan.nextDouble();
				
				System.out.println();
				System.out.print("Entre com o valor do Segundo Produto: ");
				double preco2 = scan.nextDouble();
				
				
				System.out.println();
				System.out.print("Entre com o valor do Terceiro Produto: ");
				double preco3 = scan.nextDouble();
				
				if(preco1 < preco2 && preco1 < preco3) {
					
					System.out.println();
					System.out.println("Compre o Produto 1 está Mais Barato , " + preco1);
					
				} else if (preco2 < preco1 && preco2 < preco3) {
					
					System.out.println();
					System.out.println("Compre o Produto 2 está Mais Barato , " + preco2);
					
					
				} else if(preco3 < preco1 && preco3 < preco2 ) {
					
					System.out.println();
					System.out.println("Compre o Produto 3 está Mais Barato , " + preco3);
				}
				
				scan.close();

	}

}
