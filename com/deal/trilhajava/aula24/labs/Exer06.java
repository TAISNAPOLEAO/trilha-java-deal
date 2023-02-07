package com.deal.trilhajava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.nome = "Taís";
		contato.endereco = "Rua Folha 1";
		contato.email = "tais@tais.com.br";
		
		contato.telefones = new String [5];
		contato.telefones[0] = "11994445017";
		contato.telefones[1] = "1120544357";
		
		
		System.out.println("Nome: " + contato.nome + " - " + "Telefones: " + " "+ contato.telefones[0] + " - " + contato.telefones[1]);

	}

}
