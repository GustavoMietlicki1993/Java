package com.codificando.associacao;

public class Materia {
	private String titulo;
	private Professor professor;

	public Materia(String titulo) {
		this.titulo = titulo;
	}

	public Materia() {

	}

	public void print() {
		System.out.println("Titulo da materia: " + titulo + ". ");
		System.out.println("Professor: " + professor + ". ");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
