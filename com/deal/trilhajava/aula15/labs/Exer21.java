package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Posto de Gasolina Amigos do Nelson");
		
		System.out.println();
		System.out.println("Valor do Litro do Alcool: 1,90");
		System.out.println("Valor do Litro da Gasolina: 2,50");
		
		System.out.println();
		System.out.println("Vai abaster com A-Alcool ou G-Gasolina ?");
		
		String TipoCombustivel = scan.next();
		
		
		double PrecoA = 1.90;
		double PregoG = 2.50;
		double litros = 0;
		double CalculaDesconto=0;
		double calcAlcool = 0;
		double calGasolina=0;
		
		if(TipoCombustivel.equalsIgnoreCase("a")) {
			
			System.out.println("Alcool");
			
			System.out.println("Quantos Litros?");
			litros = scan.nextDouble();
			
			if(litros<= 20) {
				
				CalculaDesconto = PrecoA - (PrecoA * 3)/100;
				System.out.println("Desconto: " + CalculaDesconto);
				
			} else if (litros > 20) {
				
				CalculaDesconto = PrecoA - (PrecoA * 5)/100;
				System.out.println("Desconto: " + CalculaDesconto);
			}
			
			calcAlcool = litros * CalculaDesconto;
			
			System.out.println(litros + " Litros "+ CalculaDesconto ); 
			System.out.println("Valor Total a Pagar: " +  calcAlcool);	
		
		}  else if(TipoCombustivel.equalsIgnoreCase("g")) {
			
			System.out.println("Gasolina");
			
			System.out.println("Quantos Litros?");
			litros = scan.nextDouble();
			
			if(litros<= 20) {
				
				CalculaDesconto = PregoG - (PregoG * 4)/100;
				System.out.println("Desconto: " + CalculaDesconto);
				
			} else if (litros > 20) {
				
				CalculaDesconto = PregoG - (PregoG * 6)/100;
				System.out.println("Desconto: " + CalculaDesconto);
			}
			
			
			calGasolina = litros * CalculaDesconto;
			
			System.out.println(litros + " Litros "+ CalculaDesconto ); 
			System.out.println("Valor Total a Pagar: " +  calGasolina);	
			
		} else {
			
			System.out.println("Tipo de Combustível Inválido");
		}

	}

}
