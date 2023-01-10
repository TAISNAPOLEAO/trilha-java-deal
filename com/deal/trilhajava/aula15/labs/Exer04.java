package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal ou
		//consoante
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verfique se a Letra Vogal ou Consoante");
		
		System.out.println("Informe a Letra: ");
		String letraVC = scan.next();
		
		if(letraVC.equalsIgnoreCase("a") || letraVC.equalsIgnoreCase("e") || letraVC.equalsIgnoreCase("i") || letraVC.equalsIgnoreCase("o")
										 || letraVC.equalsIgnoreCase("u")) {
			
			System.out.println("Vogal");
		
		} else {
			
			System.out.println("Consoante");
			
		}
		scan.close();
	}

}
