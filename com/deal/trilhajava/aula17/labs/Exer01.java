package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mostrar notas entre 0 e 10");
		System.out.println("Digite a Nota: ");
		
		boolean valida = false;
		
		while(valida == false) {
			
			
			double Nota1 = scan.nextDouble();
			
			System.out.println("Nota: " + Nota1);
			
			if(Nota1 >= 0 && Nota1 <=10) {
				valida = true;
				
				System.out.println("Nota valida: " + Nota1  + " Fim");
				
			}else {
				valida = false;
				System.out.println("Nota Invalida, digite de novo:");
			}
		}
			
		
		scan.close();

	}

}
