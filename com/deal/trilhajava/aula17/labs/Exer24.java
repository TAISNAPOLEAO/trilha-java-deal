package com.deal.trilhajava.aula17.labs;

public class Exer24 {

	public static void main(String[] args) {
		
		System.out.println("Preço do Pão:  R$ 0.18");
		System.out.println();
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		System.out.println();
		
		for(int i=1; i<=50; i++) {
			
			double valorTotal = i * 0.18;
			System.out.println(i + " - R$ " + valorTotal);
		}

	}

}
