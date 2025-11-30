package DTO;

import model.Cartao;

public class CartaoDTO {

	public int cod_cartao;
	public int numero;
	public String status;
	public int vencimento;
	public int fechamento;
	public int cod_conta;
	
	public CartaoDTO() {}
	
	
	public CartaoDTO(int cod_cartao, int numero, String status, int vencimento, int fechamento, int cod_conta) {
		super();
		this.cod_cartao = cod_cartao;
		this.numero = numero;
		this.status = status;
		this.vencimento = vencimento;
		this.fechamento = fechamento;
		this.cod_conta = cod_conta;
	}
	public CartaoDTO(Cartao c) {
		this.cod_cartao = c.getCod_cartao();
		this.numero = c.getNumero();
		this.status = c.getStatus();
		this.vencimento = c.getVencimento();
		this.fechamento = c.getFechamento();
		this.cod_conta = c.getCod_conta();
	}
	
	
}
