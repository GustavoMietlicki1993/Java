package com.codificando.associacao;

public class Escola {
	private String nome;

	public Escola(String nome) {
		this.nome = nome;
	}

	public Escola() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {

	}
	public void setDiretora(Diretora diretora) {
		
	}
	public void setProfessor(Professor professor) {
		
	}
}
