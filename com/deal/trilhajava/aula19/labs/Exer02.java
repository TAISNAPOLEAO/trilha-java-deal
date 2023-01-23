package com.deal.trilhajava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[8];
		int vetorB[] = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Informe os valores das posições:");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
		}
		//para imprimir na tela os valores do vetorA
		System.out.print("Vetor A = ");
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
		}
		//para imprimir na tela os valores do vetorB
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
		
		
	}

}
