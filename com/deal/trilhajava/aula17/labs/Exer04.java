package com.deal.trilhajava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		System.out.println("Calculo da População");
		
		double popA = 80000;
		double popB = 200000;
		int count=0;
		
		while(popA <= popB) {
			
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			count++;
			
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade em Anos: " + count);
		
	}

}
