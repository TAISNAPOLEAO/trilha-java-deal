package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		// Faça um programa para a leitura de duas notas parciais de um aluno.
				// O programa deve calcular a média alcançada por aluno e apresentar:
				//  o A mensagem "Aprovado", se a média alcançada for maior ou	igual a sete;
				//	o A mensagem "Reprovado", se a média for menor do que sete;
				//	o A mensagem "Aprovado com Distinção", se a média for igual a	dez.
				
				Scanner scan = new Scanner (System.in);
				
				System.out.println("Calculadora de Media Parcial");
				
				System.out.println();
				System.out.print("Entre com a Nota 1: ");
				double Nota1 = scan.nextDouble();
				
				System.out.println();
				System.out.print("Entre com a Nota 2: ");
				double Nota2 = scan.nextDouble();
				
				double media = (Nota1 + Nota2) / 2;
				
				if(media >= 7 && media < 10) {
					System.out.println();
					System.out.println("Aprovado");
				} else if (media < 7) {
					System.out.println();
					System.out.println("Reprovado");
				} else if (media == 10){
					System.out.println();
					System.out.println("Aprovado com Distinção");
				}
				
				scan.close();

		

	}

}
