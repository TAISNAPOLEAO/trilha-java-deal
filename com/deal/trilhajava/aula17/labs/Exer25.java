package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lojas Tabajara");
		System.out.println();
		System.out.println();
		int Produto=0;
		double valor=1;
		double total=0;
		double dinheiro=0;
		double troco=0;

		
		System.out.println("Deseja Informar nova compra: ? S/N");
		String continuarCompra = scan.next();
		
		if(continuarCompra.equalsIgnoreCase("S")) {
			
			while(valor != 0) {
				
				System.out.print("Produto: ");
				Produto = scan.nextInt();
				
				System.out.print("Valor: ");
				valor = scan.nextDouble();
				
				total = total + valor;

				
			}
			
			
			System.out.println("Total: " + total);
			
			System.out.println("Dinheiro a Receber: ");
			dinheiro = scan.nextDouble();
			System.out.println("dinheiro: " + dinheiro);
			
			troco = dinheiro - total;
			System.out.println("Troco: "+ troco);

		}else {
			System.out.println("sair");
		}
		
				
	}
	

}