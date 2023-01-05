package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculo do Salário Mensal");
		
		System.out.println("Entre com o valor da Hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de Horas trabalhadas: ");
		double  horaTrabalhada = scan.nextInt();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("O salario mensal é: " + salario);
		
		
		scan.close();
	}

}
