package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		// .Faça um Programa que peça um número inteiro e determine se ele é
	//par ou impar. Dica: utilize o operador módulo (resto da divisão).
				
				Scanner scan = new Scanner (System.in);
				
				System.out.print("Entre com um Número: ");
				
				int Num = scan.nextInt();
				
				
				System.out.println();
				
				if((Num%2) == 0) {
					
					System.out.println("Par");
				
				} else {
					
					System.out.println("IMpar");
				}

	}

}
