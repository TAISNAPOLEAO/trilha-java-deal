package com.deal.trilhajava.aula11;

public class SequenciaEscape {

	public static void main(String[] args) {
		
		//"Hello, "World!"
		System.out.println("\"Hello, World! \"");
		
		System.out.print("\"Hello, World! \"\n\r"); // retorno de carro, nao vai pra linha de baixo, 
		
		System.out.println("1\\4");

	}

}
