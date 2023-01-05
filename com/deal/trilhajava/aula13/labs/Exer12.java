package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		//  Tendo como dados de entrada a altura de uma pessoa, 
		//construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo do Peso Ideal");
		
		System.out.println();
		System.out.print("Entre com o valor da Altura: ");
		double altura = scan.nextDouble();
		
		double IMC = (72.7*altura) - 58;
		
		System.out.println("O peso ideal é: " + IMC);
		
		scan.close();
	}

}
