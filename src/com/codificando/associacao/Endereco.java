package com.codificando.associacao;

public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numCasa;
	private String cep;

	public Endereco(String estado, String cidade, String bairro, String rua, int numCasa, String cep) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numCasa = numCasa;
		this.cep = cep;
	}

	public Endereco() {

	}

	public void print() {
		System.out.println("\n\n----------------RELATORIO DE ENDERECO-----------------\n\n");
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Rua: " + this.rua);
		System.out.println("Numero da casa: " + this.numCasa);
		System.out.println("Cep : " + this.cep);

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
