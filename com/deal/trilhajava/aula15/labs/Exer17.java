package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		// Faça um Programa que peça um número correspondente a um
		//determinado ano e em seguida informe se este ano é ou não bissexto.
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Calculo do Ano Bissexto");
				
				System.out.println("Informe o Ano: ");
				int ano = scan.nextInt();
				
				if ((ano%400 == 0) || ((ano%4 ==0) && (ano%100 != 0))) {
					
					System.out.println("Ano Bissexto");
					
				} else {
					
					System.out.println("Não é Bissexto");
				}

	}

}
