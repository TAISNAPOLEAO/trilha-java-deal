package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		// Faça um Programa que leia um número e exiba o dia correspondente
		//da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		//aparecer valor inválido.
				
				Scanner scan = new Scanner (System.in);
				
				System.out.print("Entre com o dia da Semana: ");
				
				int diaSemana = scan.nextInt();
				
				System.out.println();
				
				switch(diaSemana) {
					
					
					case 1 : System.out.println("Domingo"); break;
					case 2 : System.out.println("Segunda"); break;
					case 3 : System.out.println("Terça"); break;
					case 4 : System.out.println("Quarta"); break;
					case 5 : System.out.println("Quinta"); break;
					case 6 : System.out.println("Sexta"); break;
					case 7 : System.out.println("Sábado"); break;
					default : System.out.print("Dia Inválido"); break;
				
				}
				
				scan.close();

	}

}
