package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hipermercado Tabajada");
	
		System.out.println();
	
		System.out.println("Entre com o Tipo da Carne: ");
		System.out.println("1 - file duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Quantos quilos comprar");
		double qtd = scan.nextDouble();
		
		double precoKg=0;
		
		if(tipo == 1) {
			
			System.out.println(qtd + "kg - file duplo");
			
			if(qtd < 5) {
				
				precoKg = 4.9;
				
			}else {
				
				precoKg = 5.8;
			}
		
		} else if (tipo == 2) {
			
			System.out.println(qtd + "kg - alcatra");
			
			if (qtd < 5) {
				
				precoKg = 5.9;
			} else {
				
				precoKg = 6.8;
			}
			
		} else if (tipo == 3) {
			
			System.out.println(qtd + "kg - picanha");
			
			if (qtd < 5) {
				
				precoKg = 6.9;
			} else {
				
				precoKg = 7.8;
			}

		}
		
		double total = qtd * precoKg;
		System.out.println(qtd + "kg * " + precoKg + " = " + total);
		
		System.out.println("Compra no cartao ? digite 1 para sim");
		int cartao = scan.nextInt();
		
		if(cartao == 1) {
			
			double desconto = (total / 100) * 5;
			System.out.println("Descont de: " + desconto);
			System.out.println("Valor a pagar : " + (total - desconto));
		
		} else {
			
			System.out.println("Valor a pagar: " + total);
		}

	}

}
