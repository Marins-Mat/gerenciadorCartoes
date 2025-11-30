package model;

public class Estabelecimento {
	private int cod_estabelecimento;
	private String nome_estabelecimento;
	private int cnpj;
	
	public Estabelecimento(int cod_estabelecimento, String nome_estabelecimento, int cnpj) {
		this.cod_estabelecimento = cod_estabelecimento;
		this.nome_estabelecimento = nome_estabelecimento;
		this.cnpj = cnpj;
	}
	
	public Estabelecimento() {}

	public int getCod_estabelecimento() {
		return cod_estabelecimento;
	}

	public void setCod_estabelecimento(int cod_estabelecimento) {
		this.cod_estabelecimento = cod_estabelecimento;
	}

	public String getNome_estabelecimento() {
		return nome_estabelecimento;
	}

	public void setNome_estabelecimento(String nome_estabelecimento) {
		this.nome_estabelecimento = nome_estabelecimento;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
