package com.codificando.associacao;

public class Professor {
	private String nome;
	private int matricula;
	private Materia[] materias;
	private Aluno[] alunos;
	private Diretora diretora;

	public Professor(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public Professor() {

	}

	public void print() {
		System.out.println("Nome do professor: " + nome + ". ");
		System.out.println("Matricula do professor: " + matricula + ". ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setMateria(Materia materia) {

	}

	public void setAluno(Aluno aluno) {

	}

	public void setDiretor(Diretora diretora) {

	}

}
