package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fruteria");
		
		System.out.println();
		System.out.print("Peso Maça (kg): ");
		double PesoMaca= scan.nextDouble();
		
		
		System.out.print("Peso Morango(kg): ");
		double PesoMorango= scan.nextDouble();
		
		double precoKgMorango=0;
		if(PesoMorango <= 5) {
			
			precoKgMorango = 2.5;
			
		} else {
			
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if(PesoMaca <=5) {
			
			precoKgMaca = 1.8;
					
		}else {
			
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = PesoMorango * precoKgMorango;
		double precoTotalMaca = PesoMaca * precoKgMaca;
		
		double precoParcial = precoKgMorango * precoKgMaca;
		double precoTotal = precoParcial;
		
		if(PesoMaca + PesoMorango > 8 || precoParcial > 25) {
			
			precoTotal =  precoParcial - ((precoParcial / 100) * 10);
			
		}
		
		System.out.println("Preco Total = " + precoTotal);
	}

	

}
