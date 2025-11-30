package model;

import java.sql.Date;

public class Fatura {
	private int cod_fatura;
	private int cod_barras;
	private double valor;
	private Date vencimento;
	private Date fechamento;
	private int cod_conta;
	public Fatura() {}
	
	public Fatura(int cod_fatura, int cod_barras, double valor, Date vencimento, Date fechamento, int cod_conta) {
		super();
		this.cod_fatura = cod_fatura;
		this.cod_barras = cod_barras;
		this.valor = valor;
		this.vencimento = vencimento;
		this.fechamento = fechamento;
		this.cod_conta = cod_conta;
	}
	public int getCod_fatura() {
		return cod_fatura;
	}
	public void setCod_fatura(int cod_fatura) {
		this.cod_fatura = cod_fatura;
	}
	public int getCod_barras() {
		return cod_barras;
	}
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public Date getFechamento() {
		return fechamento;
	}
	public void setFechamento(Date fechamento) {
		this.fechamento = fechamento;
	}
	public int getCod_conta() {
		return cod_conta;
	}
	public void setCod_conta(int cod_conta) {
		this.cod_conta = cod_conta;
	}
	
	
	
}
