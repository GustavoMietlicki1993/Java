package com.codificando.associacao;

import java.util.Arrays;

public class Escola {
	private String nome;
	private Endereco endereco;
	private Professor professores[];
	private Diretora diretora;
	

	public Escola(String nome) {
		this.nome = nome;
	}

	public Escola() {

	}

	@Override
	public String toString() {
		return "Escola [nome=" + nome + ", endereco=" + endereco + ", professores=" + Arrays.toString(professores)
				+ ", diretora=" + diretora + "]";
	}

	public void print() {
		System.out.println("\n\n------------RELATORIO DE ESCOLA-------------\n\n");
		System.out.println("Nome da escola: " + this.nome);
		for(Professor professor: professores ) {
		System.out.println("Nome do professor: "+ professor.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
		;
	}

	public Diretora getDiretora() {
		return diretora;
	}

	public void setDiretora(Diretora diretora) {
		this.diretora = diretora;
	}

}
