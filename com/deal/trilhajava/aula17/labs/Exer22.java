package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculo de Investimento em CDs");
		System.out.println();
		System.out.println();
		
		int qtdCDs=0;
		double valorCD=0;
		double valorTotal=0;
		double valorMedio=0;
		
		
		System.out.print("Informe a quantidade de CDs: ");	
		qtdCDs = scan.nextInt();
		
		System.out.println();
		
		for(int i=1; i<=qtdCDs; i++) {
		
			System.out.print("Informe o Valor do CD" + i + " :");
			valorCD = scan.nextDouble();
			
			valorTotal = valorTotal + valorCD;
			valorMedio = valorTotal / qtdCDs;
		}
		
		System.out.println();
		System.out.println("Valor Total Investido: " + valorTotal);
		System.out.println("Valor Medio Gasto em cada CD: " + valorMedio);
		
		
		
			
		
		
		

	}

}
