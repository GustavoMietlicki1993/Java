package com.codificando.associacaotest;

import com.codificando.associacao.Escola;
import com.codificando.associacao.Aluno;
import com.codificando.associacao.Diretora;
import com.codificando.associacao.Endereco;
import com.codificando.associacao.Materia;
import com.codificando.associacao.Professor;

public class EscolaTest {
	public static void main(String[] args) {
		Escola colegio = new Escola("Antonio Duarte de Castro");
		Diretora diretora = new Diretora();
		Professor professor = new Professor();
		Endereco endereco = new Endereco("Sao Paulo", "Jacupiranga", "botujuru", "pinheiro", 250, "11900-000");
		Aluno aluno = new Aluno("Gustavo Mietlicki", 26, 9597);
		Materia materia = new Materia("Programacao Linguagem java. ");

		professor.setDiretor(diretora);
		professor.setMateria(materia);
		professor.setAlunos(new Aluno[] { aluno });
		professor.setNome("Gerundio Afonso Aguilar");
		professor.setMatricula(63623);
		professor.print();

		
		colegio.setEndereco(endereco);
		colegio.setDiretora(diretora);
		colegio.setProfessores(new Professor[] { professor });
		colegio.print();

		diretora.setEscola(colegio);
		diretora.setNome("Camilla Duarte");
		diretora.print2();

		aluno.setDiretor(diretora);
		aluno.setEscola(colegio);
		aluno.setMaterias(new Materia[] { materia });
		aluno.setProfessores(new Professor[] { professor });
		aluno.print();

		endereco.print();

		materia.setTitulo("Linguagem JAVA");
		materia.setProfessor(professor);
		materia.print2();

	}

}
