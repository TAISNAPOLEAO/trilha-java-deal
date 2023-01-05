package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Farenheit, 
		//transforme e mostre a temperatura em graus  . o C = (5 * (F-32) / 9). 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Converte Farenheit para Celsius");
		System.out.print("Entre o valor de Farenheit: ");
		
		double Farenheit = scan.nextDouble();
		
		double Celsius = (5 * (Farenheit - 32) / 9);
		
		System.out.println(Farenheit + "  Farenheit "+ " convertido em Celsius é: " + Celsius);
		
		
		
		
		scan.close();
		

	}

}
