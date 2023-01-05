package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// . Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a Temperatura em Celsius: ");
		double Celsius = scan.nextDouble();
		
		double converte = ((Celsius * 9) /5) + 32;
		
		System.out.println("A temperatura " + Celsius + " Celius convertida em Farenheit é: " +  converte);
		
		
		
		
		
		
		scan.close();

	}

}
