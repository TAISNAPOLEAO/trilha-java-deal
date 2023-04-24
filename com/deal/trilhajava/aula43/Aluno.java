package com.deal.trilhajava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
	
	
	/*public Aluno() {
		super();
		
		
	}*/
	
	

	/*public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.cursos = curso;
	}*/



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
		//super.setCpf("333333333333");
		 //this.setCpf("3333333");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s="Endereco do Aluno: ";
		//s += this.getEndereco();
		
		return s;
		
	}
	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(cursos.equalsIgnoreCase(getCursos())) {
			
			return true;
		}
		
		return false;
	}
	
	



	/*public void ImprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}*/
	
	/*public String toString() {
		
		String s = cursos + "\n";
		for(double nota: notas) {
		
			s += nota + " ";
			
		}
		return s;*/
	
	

	
}
