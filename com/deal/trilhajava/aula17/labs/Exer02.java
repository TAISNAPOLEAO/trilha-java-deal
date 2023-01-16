package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valida Senha");
		
		boolean valida = true;
		
		while(valida == true) {
			
			System.out.println("Informe o Usuario: ");
			String Login = scan.next();
			
			System.out.println("Informe a Senha: ");
			String Senha = scan.next();
			
			if(Senha.equalsIgnoreCase(Login)) {
				
				valida = true;
				
				System.out.println("Senha não Pode ser igual Login - Digite uma nova senha");
			} else {
				
				valida = false;
				
				System.out.println("Senha OK");
			}
			
		}
		
		

	}

}
