package com.codificando.associacao;

public class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	private Professor[] professores;
	private Diretora diretor;
	private Escola escola;
	private Materia[] materias;

	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	public Aluno() {

	}

	public void print() {
		System.out.println("Nome do aluno: " + this.nome + ", ");
		System.out.println("Idade do aluno: " + this.idade + ", ");
		System.out.println("Matricula do aluno" + this.matricula + ", ");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setDiretor(Diretora diretor) {

	}

	public void setEscola(Escola escola) {

	}

	public void setProfessor(Professor professor) {

	}

	public void setMateria(Materia materia) {

	}

}
