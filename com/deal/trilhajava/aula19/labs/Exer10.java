package com.deal.trilhajava.aula19.labs;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("Informe as posições de A: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++) {
			
			vetorB[i] = vetorA[i] % 2;
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

	}

}
