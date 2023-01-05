package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversor de Metros para CM");
		System.out.print("Informe o numero em metros: ");
		
		double metros = scan.nextDouble();
		
		double convertmtcm = metros * 100;
		
		System.out.println("A conversao de: " + metros + " Metros para Centrimetros é: " + convertmtcm);
		
		
		scan.close();

	}

}
