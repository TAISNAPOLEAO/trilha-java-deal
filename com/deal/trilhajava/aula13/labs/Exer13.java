package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
				// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
				//Calcule e mostre o total do seu salário no referido mês. 
				//Descontos de 11% IR 8% INSS 5% Sindicato
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Calculo do Salário Mensal");
				
				System.out.println("Entre com o valor da Hora: ");
				double valorHora = scan.nextDouble();
				
				System.out.println("Entre com a quantidade de Horas trabalhadas: ");
				double  horaTrabalhada = scan.nextInt();
				
				double salarioBruto = valorHora * horaTrabalhada;		
						
				double IR = (salarioBruto / 100) * 11;
				double INSS = (salarioBruto / 100) *  8;
				double Sindicato = (salarioBruto /100) * 5;
				double totalDescontos = IR + INSS+ Sindicato;
				double salarioLiquido = salarioBruto - totalDescontos;
				
				System.out.println("O salario Bruto é: " + salarioBruto);
				System.out.println("Desconto do IR = " + IR);
				System.out.println("Desconto do INSS = " + INSS);
				System.out.println("Desconto do Sidicato = " + Sindicato);
				System.out.println("Total de Descontos = " + totalDescontos);
				System.out.println("Salario Liquido = " + salarioLiquido);
				
				
				scan.close();
			}


}
