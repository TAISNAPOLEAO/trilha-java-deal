package com.deal.trilhajava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nomeLivro = "A Mandibula de Caim";
		livro.autorLivro = "Edward Powys Mathers";
		livro.dataLancamento = 2022;
		livro.editora = "Intriseca";
		livro.idioma = "Portugues";
		livro.numeropaginas = 216;
		livro.ISBN10 = "6555604425";
		livro.ISBN13 = "978-6555604429";

		livro.emprestado=true;
		livro.dataEntrega= new Date();
		livro.empretadoA = "Mariazinha";
		
		
		System.out.println("Nome do Livro: " + livro.nomeLivro);
		System.out.println("Data de Lançamento do Livro: " + livro.dataLancamento);
		System.out.println("Autor do Livro: " + livro.autorLivro);
		System.out.println("Editora do Livro: " + livro.editora);
		System.out.println("Idioma do Livro: " + livro.idioma);
		System.out.println("Numero de Paginas do Livro: " + livro.numeropaginas);
		System.out.println("ISBN-10 do Livro: " + livro.ISBN10);
		System.out.println("ISBN-13 do Livro: " + livro.ISBN13);
		
		System.out.println("Emprestado: " + livro.emprestado);
		System.out.println("Emprestado A : " + livro.empretadoA);
		System.out.println("Data da entrega: " + livro.dataEntrega);
		

	}

}
