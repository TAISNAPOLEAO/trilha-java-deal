package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas calcular a media de idade: ");
		int enepessoas = scan.nextInt();
		
		int somaidade=0;
		int mediaidade=0;
		int idade;
		
		for(int i=0; i<enepessoas; i++) {
			
			System.out.println("Informe a idade das pessoas: " + (i+1));
			idade = scan.nextInt();
			
			somaidade = somaidade + idade;
			mediaidade = somaidade / enepessoas;
			
		}
		
		System.out.println("Total de idade: " + somaidade);
		System.out.println("Media de idade: " + mediaidade);
		
		if(mediaidade >0 && mediaidade <=25) {
			
			System.out.println("Idade entre 0 e 25 é populacao Jovem");
		
		}
		
		if(mediaidade >26 && mediaidade <=59) {
			
			System.out.println("Idade entre 26 e 59 é populacao Adulto");
		}
		
		if(mediaidade >=60) {
			
			System.out.println("Idade igual ou maior que 60 população Idosa");
		}
		
		

	}

}
