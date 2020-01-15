package com.codificando.associacao;

public class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	private Professor[] professores;
	private Diretora diretor;
	private Escola escola;
	private Materia materias[];
	static int i, j;

	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	public Aluno() {

	}

	public void print() {
		System.out.println("\n\n--------------RELATORIO DE ALUNOS--------------\n\n");
		System.out.println("Nome do aluno: " + this.nome + ", ");
		System.out.println("Idade do aluno: " + this.idade + ", ");
		System.out.println("Matricula do aluno: " + this.matricula + ", ");
		System.out.println("Diretora: " + diretor.getNome());
		System.out.println("Escola: " + escola.getNome());
		if (materias != null) {
			for (Materia materia : materias) {
				System.out.println("Materia :" + materia.getTitulo() + ", ");
			}
		} else {
			System.out.println("Nenhuma materia cadastrada");
		}
		if (professores != null) {
			for (Professor professor : professores) {
				System.out.println("Professor: " + professor.getNome() + ", ");
			}
		} else {
			System.out.println("Nenhum professor cadastrado. ");
		}
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

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
		
	}

	public Diretora getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretora diretor) {
		this.diretor = diretor;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Materia[] getMaterias() {
		return materias;
	}

	public void setMaterias(Materia[] materia) {
		this.materias = materia;
		
	}

}
