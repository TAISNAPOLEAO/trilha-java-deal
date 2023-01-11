package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CSI");
		
		System.out.println();
		
		
		System.out.println("Telefonou para a vítima? 1-Sim 2-Não");
		int resp1 = scan.nextInt();
		
		System.out.println("Esteve no Local do Crime? 1-Sim 2-Não");
		int resp2 = scan.nextInt();
		
		System.out.println("Mora perto da Vítima? 1-Sim 2-Não");
		int resp3 = scan.nextInt();
		
		System.out.println("Devia para Vítima? 1-Sim 2-Não");
		int resp4 = scan.nextInt();
		
		System.out.println("Já trabalhou com a vítima? 1-Sim 2-Não");
		int resp5 = scan.nextInt();
		
		int soma = resp1 + resp2 + resp3 + resp4 + resp5;
		
		if(soma == 5) {
			
			System.out.println("Assassino");
			
		} else if (soma==8) {
			
			System.out.println("Suspeita");
			
		} else if(soma==6 || soma==7) {
			
			System.out.println("Cúmplice");
			
		} else if(soma==10) {
			
			System.out.println("Inocente");
		}

	}

}
