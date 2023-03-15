package com.deal.trilhajava.aula27.labs;

public class ContaCorrente {
	
	int numConta;
	String agencia;
	double saldo;
	double limiteEspecial;
	boolean statusespecial;
	double valorEspecialUsado;
	
	//tem saldo na conta
	boolean realizarSaque(double quantiaASacar) {
		if(saldo >= quantiaASacar) {
			saldo = saldo - quantiaASacar;
			return true;
		}else { //nao tem saldo 
			if(statusespecial) { 
				//verifica se o limite especial tem saldo
				double limite = limiteEspecial - saldo;
				if(limite >= quantiaASacar) {
					saldo = saldo - quantiaASacar;
					
				}else {
					return false;
				}
				
			}else {
				System.out.println("Sem saldo para Saque");
				return false;//não é espécial e nao tem saldo suficiente
			}
			
		}
	}
	
}
