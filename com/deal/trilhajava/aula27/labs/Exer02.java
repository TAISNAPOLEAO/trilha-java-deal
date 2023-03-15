package com.deal.trilhajava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numConta = 1796;
		conta.agencia = "1234";
		conta.saldo = 10;
		conta.limiteEspecial = 500;
		conta.statusespecial = true;//se é uma conta especial ou nao
		
		System.out.println("Saldo da conta " + conta.numConta + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
	}

}
