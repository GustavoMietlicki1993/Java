package com.codificando.associacao;

public class Professor extends Aluno {

	private Materia materia;
	private Aluno alunos[];
	private Diretora diretora;

	public Professor(String nome, int matricula) {

	}

	public Professor() {

	}

	public void print() {
		System.out.println("\n\n-----------------RELATORIO DE PROFESSORES-----------------\n\n");
		System.out.println("Nome do professor: " + super.getNome() + ". ");
		System.out.println("Matricula do professor: " + super.getMatricula() + ". ");
		if (materia != null) {

			System.out.println("Materia :" + materia.getTitulo());

		} else {
			System.out.println("Nenhuma materia cadastrada");
		}
		if (alunos != null && alunos.length != 0) {
			for (Aluno aluno : alunos) {
				System.out.println("Aluno: " + aluno.getNome());
			}
			return;
		}

		System.out.println("Diretora" + this.diretora.getNome());
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;

	}

	public Diretora getDiretora() {
		return diretora;
	}

	public void setDiretora(Diretora diretora) {
		this.diretora = diretora;
	}

}
