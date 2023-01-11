package com.deal.trilhajava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("FOLHA DE PAGAMENTO - CALCULO DE DESCONTOS");
		
		
		System.out.println();
		System.out.print("Entre com o valor da Hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de Horas Trabalhadas: ");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		System.out.println();
		System.out.println("Salario Bruto: " + salarioBruto);
		
		double IR = 0;
		
		if(salarioBruto < 900) {
			
			IR = 0;
			
		} else if(salarioBruto >= 900 && salarioBruto <=1500) {
			
			IR = 5;
			
		} else if (salarioBruto > 1500 && salarioBruto<= 2500) {
			
			IR = 10;
			
		} else if (salarioBruto > 2500){
			
			IR = 20;
		}
		
		double descontoIR = (salarioBruto * IR) / 100;
		System.out.print("(-) IR " + " ( " + IR + " %) : R$ " + descontoIR);
		
		System.out.println();
		double INSS = (salarioBruto * 10) / 100;
		System.out.print("(-) INSS " + " ( " + 10 + " %) : R$ " + INSS);
		
		System.out.println();
		double FGTS = (salarioBruto * 11) / 100;
		System.out.print("(-) FGTS " + " ( " + 11 + " %) : R$ " + FGTS);
		
		double descontos = descontoIR + INSS;
		
		System.out.println();
		
		System.out.print("Total de Desontos : R$ " + descontos);
		
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println();
		System.out.print("Salario Liquido: " + salarioLiquido);
		
		
		
		scan.close();

	}

}
