package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		// Faça um Programa que leia três números e mostre o maior deles.
		
				Scanner scan = new Scanner (System.in);
				
				System.out.println("Leitura de três numero e mostrando o Maior Deles");
				
				System.out.println();
				System.out.print("Entre com o Primeiro Numero: ");
				int Num1 = scan.nextInt();
				
				System.out.println();
				System.out.print("Entre com o Segundo Numero: ");
				int Num2 = scan.nextInt();
				
				
				System.out.println();
				System.out.print("Entre com o TErceiro Numero: ");
				int Num3 = scan.nextInt();
				
				if(Num1 > Num2 && Num1 > Num3){
					
					System.out.println();
					System.out.println(Num1 + " é Maior");
					System.out.println();
					System.out.println(Num1 + " - " + Num2 + " - " + Num3);
					
				} else if(Num2 > Num1 && Num2 > Num3) {
					
					System.out.println();
					System.out.println(Num2 + " é Maior");
					System.out.println();
					System.out.println(Num2 + " - " + Num1 + " - " + Num3);
					
				} else if(Num3 > Num1 && Num3 > Num2){
					
					System.out.println();
					System.out.println(Num3 + " é Maior");
					System.out.println();
					System.out.println(Num3 + " - " + Num1 + " - " + Num2);
				}
				
				
				scan.close();

	}

}
