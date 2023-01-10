package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verfique se a Letra é F(Feminino) M (Masculino)");
		
		System.out.println("Informe Uma Letra: ");
		String letraFM = scan.next();
		
		if(letraFM.equalsIgnoreCase("F")) {
			
			System.out.println("F - Feminino");
		
		} else if (letraFM.equalsIgnoreCase("M")) {
			
			System.out.println("M - Masculino");
		} else {
			
			System.out.println("Sexo Inválida");
		}


	}

}
