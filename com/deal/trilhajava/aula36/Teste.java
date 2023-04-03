package com.deal.trilhajava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamento tem-um endereco
		//criar o objeto endereco
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setCep("9999999");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone
		//criar o objeto Telefone
		Telefone telefone = new Telefone();
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		telefone.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("11");
		telefone2.setNumero("88888-88888");
		telefone2.setTipo("casa");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefones(telefone);
		contato.setTelefones(telefones);
		
		//Teste saida no console
		
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() !=null) {
			
			
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefones() != null) {
			
			System.out.println(contato.getTelefones());
		}*/
		
		if(contato != null && contato.getTelefones() !=null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
