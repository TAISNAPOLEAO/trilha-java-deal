package com.deal.trilhajava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setCursos("Ciencia da Computação");
		
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "adadfadfadfas";
		String s2 = "adadfadfadfas";
		
		System.out.print(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCursos("Ciencia da Computação");
		
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
