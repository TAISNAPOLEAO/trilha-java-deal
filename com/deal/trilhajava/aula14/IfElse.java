package com.deal.trilhajava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com a sua Idade");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			
			System.out.println("É maior de idade.");
			
		}else {
			
			System.out.println("Não É maior de idade.");
		}*/
		
		//barato <= 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor 18 - pesquisar mais
		// >= 17 - muito caro
		
		System.out.println("Entre com o preço do Item:");
		double valor = scan.nextDouble();
		
		if(valor <=10) {
			
			System.out.println("Está barato, pode comprar");
			
		} else if(valor > 10 && valor < 15) {
			
			System.out.println("Você podePedir desconto");			
			
		} else if(valor >= 15 && valor < 17) {
			
			System.out.println("Você pode pequisar mais");
			
		}else { //>= que 17
			
			System.out.println("Muito Caro");
		}
		
		scan.close();
	}

}
