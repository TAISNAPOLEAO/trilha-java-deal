package com.deal.trilhajava.aula17.labs;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exer24_entrada_dados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preço do Pão:  R$ 0.18");
		System.out.println();
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		System.out.println();
		
		boolean valido = true;
		
		System.out.print("Informe a quantidade de paes: ");
		
		
		while(valido == true) {
			
			int qtpaes = scan.nextInt();
			
			if(qtpaes >=1 && qtpaes <=50) {
				valido = false;
				double valorTotal = qtpaes * 0.18;
				
				System.out.println(qtpaes + " - R$ " + valorTotal);
				System.out.println();
			} else {
				valido = true;
				System.out.print("Limite de Paes 50. Digite a quantidade de paes novamente: ");
				System.out.println();
			}
			
		}
		
		
		

}
}