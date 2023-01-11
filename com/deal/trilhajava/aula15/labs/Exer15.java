package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.print("Tipos de Triangulo");
		
		System.out.println();
		System.out.println();
		System.out.print("Entre com o Lado 1: ");
		int Lado1 = scan.nextInt();
		
		System.out.print("Entre com o Lado 2: ");
		int Lado2 = scan.nextInt();
		
		System.out.print("Entre com o Lado 3: ");
		int Lado3 = scan.nextInt();
		
		if (Lado1 == Lado2 && Lado1 == Lado3 && Lado2 == Lado3) {
			
			System.out.print("Triangulo Equilatero");
			
		} else if (Lado1 != Lado2 && Lado1 != Lado3 && Lado3 >= Lado2) {
			
			System.out.print("Triangulo Escaleno");
		} else if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3){
			
			System.out.print("Triangulo Isóceles");
		}
		
		
		
		scan.close();

	}

}
