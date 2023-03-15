package com.deal.trilhajava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	
	public double obterAutonomia() {
		
		System.out.println("Método Obter Autonomia foi chamado.");
		return this.capCombustivel * consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		
		return km/consumoCombustivel;
		
	}
	
	public double calcularCombustivel(double km) {
		
		this.divideKMPorConsumoCombustivel;	
		
	}
}
