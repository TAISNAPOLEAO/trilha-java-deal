package com.deal.trilhajava.aula19.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		double vetorB[] = new double[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Informe as posições");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println();
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
						
			System.out.print(vetorA[i] + " ");
		}
		
		System.err.println();
		System.out.print("Vetor B =");
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}

	}

}
