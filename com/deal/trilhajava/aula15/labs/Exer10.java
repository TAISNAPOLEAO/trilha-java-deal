package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		// Faça um Programa que pergunte em que turno você estuda. Peça
		//para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
		//mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
		//Inválido!", conforme o caso.

				Scanner scan = new Scanner(System.in);
				
				System.out.println("Em qual Turno Estuda?:");
				System.out.println();
				
				System.out.println("M-Matutino"); 
				System.out.println("V-Vespertino"); 
				System.out.println("N-Norturno");
				System.out.println();
				
				String turno = scan.next();
				
				
				if(turno.equalsIgnoreCase("M")){
					
					System.out.println();
					System.out.println("Bom Dia!!");
					
				} else if(turno.equalsIgnoreCase("V")) {
					
					System.out.println();
					System.out.println("Boa Tarde!!");
					
				} else if(turno.equalsIgnoreCase("N")) {
					
					System.out.println();
					System.out.println("Boa Noite!!");
					
				} else {
					
					System.out.println();
					System.out.println("Turno Invalido!!");
				}
				
					
				
				scan.close();

	}

}
