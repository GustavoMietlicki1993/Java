package com.codificando.associacao;

public class Diretora {
	private String nome;
	private Escola escola;

	public Diretora(String nome) {
		this.nome = nome;
	}

	public Diretora() {
	}

	public void print() {
		System.out.println("Nome da Diretora: " + nome + ". ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEscola(Escola escola) {
		
	}
}
