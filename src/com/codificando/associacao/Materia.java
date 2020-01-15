package com.codificando.associacao;

public class Materia {
	private String titulo;
	private Professor professor;

	public Materia(String titulo) {
		this.titulo = titulo;
	}

	public Materia() {

	}

	public void print2() {
		System.out.println("\n\n---------------RELATORIO DE MATERIAS---------------\n\n");

		if (this.professor != null)
			System.out.println("Professor: " + this.professor.getNome());
		else {
			System.out.println("A materia esta sem professor. ");
		}

		System.out.println("Titulo da materia: " + this.titulo + ". ");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
