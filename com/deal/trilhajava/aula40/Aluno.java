package com.deal.trilhajava.aula40;

public class Aluno extends Pessoa{
	
	
	public Aluno() {
		super();
		
		
	}
	
	

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.cursos = curso;
	}



	private String cursos;
	private double[] notas;
	

	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		
		return 0;
	}
	
	public boolean verificarAprovado() {
		
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("333333333333");
		 this.setCpf("3333333");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s="Endereco do Aluno: ";
		s += this.getEndereco();
		
		return s;
		
	}
}
