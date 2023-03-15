package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade de Turmas: ");
		int qtdTurma = scan.nextInt();
		
		int qtdAlunos;
		int soma = 0;
		
		boolean valido40 = true;
		
		for (int i=1; i<=qtdTurma; i++) {
			
			
			System.out.println("Informe a quantidade de Alunos: " + i);
			qtdAlunos = scan.nextInt();
	
			while(valido40 == false) {
			
				if(qtdAlunos<=40) {
					valido40 = false;
					System.out.println("Menor e igual a  40 - fim");

				} else {
					valido40 = true;
					System.out.println("Maior que 40 informe valor até 40");
					
					System.out.println("Informe a quantidade de Alunos: ");
					
				}
				
				
			
		}
			soma = soma + qtdAlunos;
			System.out.println("Soma: " + soma);
			
		}
		
		double media = soma / qtdTurma;
		System.out.println("Media: " + media);
	}

}

