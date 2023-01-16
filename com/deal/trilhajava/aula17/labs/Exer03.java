package com.deal.trilhajava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Validando Informações");
		
		boolean validaNome = true;
		
		while(validaNome == true){
			System.out.println("Informe seu nome com mais de tres caracteres: - Digite Novamente");
			String nome = scan.next();
			
			if(nome.length() < 3) {
				validaNome = true;
				System.out.println("Nome precisa ser maior que tres caracteres: ");
				
				
			}else {
				validaNome = false;
				System.out.println("Nome OK ");
			}

			
		}
		
		boolean validaIdade= true;
		
		while(validaIdade == true) {
			
			System.out.println("Entre com a Idade entre 0 e 150");
			int idade = scan.nextInt();
			
			if(idade >= 0 && idade <=150) {
				validaIdade= false;
				System.out.println("Idade Ok");
			
			}else {
				validaIdade= true;
				System.out.println("Entre com uma idade valida - Digite Novamente");
			}
			
		}
			
		
		boolean validaSalario = true;
		
		while(validaSalario == true) {
			
			System.out.println("Informe o Salario: ");
			double salario = scan.nextDouble();
			
			if(salario <=0) {
				validaSalario = true;
				System.out.println("O salario precisa ser maior que zero");
			
			} else {
				validaSalario = false;
				System.out.println("Salario OK");
			}
			
		}
		
		boolean validaSexo = true;
		
		while(validaSexo == true) {
			
			System.out.println("Informe o sexo (F) ou (M): ");
			String sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("F")) {
				validaSexo = false;
				System.out.println("Sexo Feminino ");
			
			} else if (sexo.equalsIgnoreCase("M")){
				validaSexo = false;
				System.out.println("Sexo Masculino");
			
			} else {
				validaSexo = true;
				System.out.println("Opção invalida");
			}
		}
		
		boolean validaEstadocivil = false;
		
		while(validaEstadocivil == false) {
			
			System.out.println("Informe o Estado Civil (s-solteiro, c-casado,v-viuvo, d-divorciado");
			String estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("c")) {
				validaEstadocivil = true;
				System.out.println("Casado");
			
			} else if(estadoCivil.equalsIgnoreCase("s")) {
				validaEstadocivil = true;
				System.out.println("Solteiro");
			
			}else if(estadoCivil.equalsIgnoreCase("v")) {
				validaEstadocivil = true;
				System.out.println("Viuvo");
			
			}else if(estadoCivil.equalsIgnoreCase("d")) {
				validaEstadocivil = true;
				System.out.println("Divorciado");
			
			}else {
				validaEstadocivil = false;
				System.out.println("Opcao Invalida");
			}
			
		}
		
	}

}
