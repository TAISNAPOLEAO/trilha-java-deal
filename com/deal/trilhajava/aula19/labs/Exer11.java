package com.deal.trilhajava.aula19.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("Informe as posicoes de A = ");
			vetorA[i] = scan.nextInt();
						
		}
		
		int qtdpares=0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdpares++;
			}
		}
		
		System.out.println();
		System.out.print("Valores de A =" );
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("Quantidade de Pares: " + qtdpares);
	}

}
