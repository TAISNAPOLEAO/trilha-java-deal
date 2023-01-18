package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe qual tabuada:");
		int tabuada = scan.nextInt();
		
		for(int i=0; i<=10; i++) {
			
			int multiplica = tabuada * i;
			System.out.println("Tabuada de: " + tabuada + " * " + i + " = " + multiplica);
			
		}
		

	}

}
