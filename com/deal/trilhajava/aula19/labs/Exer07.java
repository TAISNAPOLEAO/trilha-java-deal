package com.deal.trilhajava.aula19.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("Informe as posições de A: ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<vetorB.length; i++) {
			System.out.print("Informe as posições de B: ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		System.out.println();
		System.out.print("Valores de A = ");
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.println();
		System.out.print("Valores de B = ");
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("Valores de C =");
		for(int i=0; i<vetorC.length; i++) {
			
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
