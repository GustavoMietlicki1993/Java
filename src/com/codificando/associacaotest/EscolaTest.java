package com.codificando.associacaotest;

import com.codificando.associacao.Escola;
import com.codificando.associacao.Aluno;
import com.codificando.associacao.Diretora;
import com.codificando.associacao.Endereco;
import com.codificando.associacao.Materia;
import com.codificando.associacao.Professor;

public class EscolaTest {
	public static void main(String[] args) {
		Escola escola = new Escola("Antonio Duarte de Castro");
		Diretora diretora = new Diretora("Camilla Duarte");
		Professor professor = new Professor("Gerundio Afonso Aguilar", 6375);
		Endereco endereco = new Endereco("Sao Paulo", "Jacupiranga", "botujuru", "pinheiro", 250, "11900-000");
		Aluno aluno = new Aluno("Gustavo Mietlicki", 26, 9597);
		Materia materia = new Materia("Linguagem JAVA");

		escola.setEndereco(endereco);
		escola.setDiretora(diretora);
		escola.setProfessor(professor);

		professor.setDiretor(diretora);
		professor.setMateria(materia);
		professor.setAluno(aluno);

		aluno.setDiretor(diretora);
		aluno.setEscola(escola);
		aluno.setMateria(materia);
		aluno.setProfessor(professor);

		diretora.setEscola(escola);

	}

}
