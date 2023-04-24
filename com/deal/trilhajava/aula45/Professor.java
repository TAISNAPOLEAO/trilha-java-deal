package com.deal.trilhajava.aula45;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;
	
	

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double calculaSalarioLiquido() {
		
		return 0; 
	}
	
	public String obterEtiquetaEndereco() {
		
		String s="Endereco do Professor: ";
		s += this.getEndereco();
		
		return s;
		
	}
}
