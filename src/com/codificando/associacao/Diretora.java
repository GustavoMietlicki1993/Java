package com.codificando.associacao;

public class Diretora extends Aluno {
	private String nome;

	public Diretora() {

	}

	public void print2() {
		System.out.println("\n\n-------------RELATORIO DA DIRETORIA--------------\n\n");
		System.out.println("Nome da Diretora: " + this.nome);
		if (super.getEscola() != null)
			System.out.println("Nome da escola: " + super.getEscola().getNome());
		else
			System.out.println("O valor é nulo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
