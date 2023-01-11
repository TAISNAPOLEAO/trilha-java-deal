package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo da Equação do Segundo Grau");
		System.out.println();
		System.out.println("ax2 + bx + c = 0");
		
		System.out.println();
		System.out.print("Entre com o Valor de A: ");
		double NumA = scan.nextDouble();
	
		if(NumA == 0) {
			
			System.out.println();
			System.out.println("Não é uma equação do Segundo Grau");
			
		} else {
			
			//System.out.println();
			System.out.print("Entre com o Valor de B:");
			double NumB = scan.nextDouble();
			
			//System.out.println();
			System.out.print("Entre com o Valor de C:");
			double NumC = scan.nextDouble();
			
			System.out.println();
			System.out.println("Calculo de Delta: ");
			double Delta = Math.pow(NumB, 2) - 4 * (NumA * NumC);
			
			System.out.println();
			System.out.println("Delta : " + Delta);
			
			System.out.println();
			System.out.print("Calculo das Raízes: ");
			
			System.out.println();
			double x1 = (-NumB + Math.sqrt(Delta)) / (2 * NumA);	
			System.out.print("X1: " + x1);
			
			System.out.println();
			double x2 = (-NumB - Math.sqrt(Delta)) / (2 * NumA);	
			System.out.print("X2: " + x2);
			
			
		}

	}

}
