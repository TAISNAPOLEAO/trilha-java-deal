package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Calculo da Area do Quadrado ");
		
		System.out.print("Entre com o valor da area: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("Calculo da Area do Quadrado: " + area);
		
		System.out.println("O dobro da Area do Quadrado é: " + area * 2);
		
		
		
		
		scan.close();

	}

}
