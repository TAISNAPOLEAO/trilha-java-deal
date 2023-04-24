package com.deal.trilhajava.aula39;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "ssdfdfdfdsfds";
		super.nomeVisibilidade = "dfadfadfadfdfa";
		
		this.setNomeVisibilidade("dfadfadfad");
		
	}
	

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
}
