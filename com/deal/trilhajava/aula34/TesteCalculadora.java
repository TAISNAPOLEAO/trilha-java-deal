package com.deal.trilhajava.aula34;

public class TesteCalculadora {
	
	static int resultSoma;
	
	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		soma2valores(1, 2);
		
	}
	
	static int soma2valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}
	
}
