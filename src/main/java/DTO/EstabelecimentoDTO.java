package DTO;

import model.Estabelecimento;

public class EstabelecimentoDTO {

	public int cod_estabelecimento;
	public String nome_estabelecimento;
	public int cnpj;
	
	public EstabelecimentoDTO() {}
	
	
	public EstabelecimentoDTO(int cod_estabelecimento, String nome_estabelecimento, int cnpj) {this.cod_estabelecimento = cod_estabelecimento;
		this.nome_estabelecimento = nome_estabelecimento;
		this.cnpj = cnpj;
	}
	public EstabelecimentoDTO(Estabelecimento est) {
		this.cod_estabelecimento = est.getCod_estabelecimento();
		this.nome_estabelecimento = est.getNome_estabelecimento();
		this.cnpj = est.getCnpj();
	}
	
	
	
}
