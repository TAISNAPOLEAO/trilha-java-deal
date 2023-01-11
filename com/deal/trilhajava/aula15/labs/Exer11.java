package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		// As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para 
		//desenvolver o programa que calculará os reajustes.
		//o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
		//o salários até R$ 280,00 (incluindo) : aumento de 20%
		//o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		//o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		//o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
		//o o salário antes do reajuste;
		//o o percentual de aumento aplicado;
		//o o valor do aumento;
		//o o novo salário, após o aumento
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("ORGANIZACOES TABAJARA");
				System.out.println("Reajuste Salarial");
				
				System.out.println();
				System.out.print("Entre com o Salario Atual: ");
				double salario = scan.nextDouble();
				
				//System.out.print("Entre com a porcentagem: ");
				int porcento = 0;
				
				//System.out.println("Entre com o Salario Atual: ");
				double salarioAjustado = 0;
				
					
				if(salario <= 280) {
					
					porcento = 20;

				} else if(salario >= 280 && salario < 700) {
					
					porcento = 15;
					
				} else if (salario >= 700 && salario <= 1500) {
					
					porcento = 10;
					
				} else if (salario > 1500 ){
					
					porcento = 5;
					
				}
				
				
				salarioAjustado = salario + (salario * porcento) / 100;
				double valor =  salarioAjustado - salario;

				System.out.println("Reajuste: "+ porcento + " %");
				System.out.println("Valor do Reajuste: " + valor);
				System.out.println("Salario Reajustado: "+ salarioAjustado);
				
				
				scan.close();

	}

}
