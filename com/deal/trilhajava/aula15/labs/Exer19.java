package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Resultado de Operações");
		
			
		System.out.println();
		System.out.print("Entre com o Numero 1: ");
		int Num1 = scan.nextInt();
		
		System.out.print("Entre com o Numero 2: ");
		int Num2 = scan.nextInt();	
		
		System.out.println();
		System.out.println("Qual Operação Deseja Fazer ? 1-Soma(+) 2-Subtracao(-) 3-Multiplicação(*) 4-Divisão(/) :");
		int operacao = scan.nextInt();
		
		int soma = Num1 + Num2;
		int subtra = Num1 - Num2;
		int multiplica = Num1 * Num2;
		int divide = Num1 / Num2;
		

		if(operacao==1) {
			
			
			System.out.println("Soma: " +  soma);
			
			if(soma%2==0) {
				
				System.out.println("Numero Par");
				
			} else {
				
				System.out.println("Numero Impar");
				
			}
			
			if (soma >=0) {
				
				System.out.println("Positivo");
				
			} else if(soma <0) {
				
				System.out.println("Negativo");
			}
		
		} else if (operacao==2) {
			
			
			System.out.println("Subtracao: " + subtra);
			
			if(subtra%2==0) {
				
				System.out.println("Par");
				
			}else {
				
				System.out.println("Impar");
			}
			
			if(subtra>=0) {
				
				System.out.println("Positivo");
				
			} else if(subtra < 0) {
				
				System.out.println("Negativo");
			}
				
			
		} else if(operacao==4){
			
			
			System.out.println("Divide: " + divide);
			
			if(divide%2==0) {
				
				System.out.println("Par");
				
			} else {
				
				System.out.println("Impar");
				
			}
			
			if(divide >0) {
				
				System.out.println("Positivo");
				
			} else if(divide <0) {
				
				System.out.println("Negativo");
				
			}
			
		} else {
			
			System.out.println("Opção Inválida");
		}
		

	}

}
