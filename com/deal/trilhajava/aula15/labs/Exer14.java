package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		// Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
		//, e calcule a sua média. A  atribuição de conceitos obedece à tabela abaixo:

				Scanner scan = new Scanner(System.in);
				
				System.out.print("Calculo de Medias Parciais");
				System.out.println();
				System.out.println();
				
				System.out.print("Entre com a Nota 1: ");
				double Nota1 = scan.nextDouble();
				
				System.out.print("Entre com a Nota 2: ");
				double Nota2 = scan.nextDouble();
				
				double Media = (Nota1 + Nota2 ) / 2;
				
				if(Media > 9 && Media <= 10) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: A" + " APROVADO");
				
				} else if (Media > 7.5 && Media <= 9) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: B" + " APROVADO");
					
				} else if (Media > 6 && Media <= 7.5) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: C" + " APROVADO");
				
				} else if (Media >= 4 && Media <= 6) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: D" + " REPROVADO");
				
				} else if (Media > 4 && Media <= 6) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: D" + " REPROVADO");
				
				}	else if (Media <= 4 && Media <= 0) {
					
					System.out.println();
					System.out.print("Nota 1: " + Nota1 + " Nota 2: " + Nota2 + " Media: " + Media + " Conceito: E" + " REPROVADO");
				
				}		
				
				
				scan.close();

	}

}
