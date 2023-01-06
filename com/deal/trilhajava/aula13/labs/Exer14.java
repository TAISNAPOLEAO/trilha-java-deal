package com.deal.trilhajava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
		//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculo de Tempo de Download de Arquivo");
		
		System.out.println("Informe o tamanho do arquivo para Download");
		int download =  scan.nextInt();
		
		System.out.println("Informe a Velocidade do Link");
		int velocidade =  scan.nextInt();
		
		int calculoTempo = download / velocidade;
		
		System.out.println("O tempo para download é: " + calculoTempo + " minutos");
		
		

	}

}
