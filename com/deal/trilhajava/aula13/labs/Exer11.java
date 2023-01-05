package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		//  Faça um Programa que peça 2 números inteiros e um número real. 
		//Calcule e mostre: 
		//a. o produto do dobro do primeiro com metade do segundo . 
		//b. a soma do triplo do primeiro com o terceiro. 
		//c. o terceiro elevado ao cubo. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com dois numero Inteiros: ");
		System.out.println("");

		
		System.out.print("Entre com o Numero 1:  ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com o Numero 2:  ");
		int num2 = scan.nextInt();
		
		System.out.print("Entre com o Numero 3:  ");
		double num3 = scan.nextDouble();
		
		System.out.println();
		System.out.println("Calculo 1: Caucule produto do dobro do primeiro com metade do segundo .");
		int calculo1 = (num1 * 2) * (num2 / 2);
		System.out.println("Calculo 1 : " + calculo1);
		
		System.out.println();
		System.out.println("Calculo 2: a soma do triplo do primeiro com o terceiro.");
		double calculo2 = (num1 * 3) + num3;
		System.out.println("Calculo 2 : " + calculo2);
		
		System.out.println();
		System.out.println("Calculo 3: terceiro elevado ao cubo.");
		double calculo3 = Math.pow(num3, 3);
		System.out.println("Calculo 3 : " + calculo3);
		
		
		
		
		scan.close();

	}

}
