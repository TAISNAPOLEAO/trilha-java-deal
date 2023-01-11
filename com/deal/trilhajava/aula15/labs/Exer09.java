package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		// Faça um Programa que leia três números e mostre-os em ordem
		//decrescente
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Ordenação Decrescente");
				
				System.out.println();
				System.out.print("Entre com o Numero 1: ");
				int Num1 = scan.nextInt();
				
				System.out.println();
				System.out.print("Entre com o Numero 2: ");
				int Num2 = scan.nextInt();
				
				System.out.println();
				System.out.print("Entre com o Numero 3: ");
				int Num3 = scan.nextInt();
				
				if(Num1 > Num2 && Num1 > Num3) {
					
					
					    System.out.println();
						if (Num2 > Num3) {
							
							System.out.println(Num1 + "-" + Num2 + "-" + Num3);
						} else {
							System.out.println(Num1 + "-" + Num3 + "-" + Num2);
						}
						
					} else if(Num2 > Num1 && Num2 > Num3) {
						
						System.out.println();
						if(Num1 > Num3) {
						
							System.out.println(Num2 + "-" + Num1 + "-" + Num3);
						} else {
							System.out.println(Num2 + "-" + Num3 + "-" + Num1);
							
						}
						
					} else if(Num3 > Num1 && Num3 > Num2) {
						
						System.out.println();
						if(Num1 > Num2) {
							
							System.out.println(Num3+ "-" + Num1 + "-" + Num2);
						} else {
							
							System.out.println(Num3+ "-" + Num2 + "-" + Num1);
						}
					}


				scan.close();

	}

}
