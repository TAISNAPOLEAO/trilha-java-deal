package com.deal.trilhajava.aula24.labs;

public class Exer05 {
	
	public static void main(String [] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numConta = 1796;
		conta.agencia = "1234";
		conta.saldo = -10;
		conta.limiteEspecial = 10.000;
		conta.especial = true;
		
		System.out.println("Saldo: " + " " + conta.saldo + " da Conta: " + conta.numConta);
		
		
		
		
		
	}
}
