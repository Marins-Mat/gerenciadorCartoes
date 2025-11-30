package DTO;

import java.sql.Date;

import model.Fatura;

public class FaturaDTO {

	public int cod_fatura;
	public int cod_barras;
	public double valor;
	public Date vencimento;
	public Date fechamento;
	public int cod_conta;
	public FaturaDTO() {}
	public FaturaDTO(int cod_fatura, int cod_barras, double valor, Date vencimento, Date fechamento, int cod_conta) {
		super();
		this.cod_fatura = cod_fatura;
		this.cod_barras = cod_barras;
		this.valor = valor;
		this.vencimento = vencimento;
		this.fechamento = fechamento;
		this.cod_conta = cod_conta;
	}
	public FaturaDTO(Fatura f) {
		super();
		this.cod_fatura = f.getCod_fatura();
		this.cod_barras = f.getCod_barras();
		this.valor = f.getValor();
		this.vencimento = f.getVencimento();
		this.fechamento = f.getFechamento();
		this.cod_conta = f.getCod_conta();
	}
	
	
	
	
	
}
