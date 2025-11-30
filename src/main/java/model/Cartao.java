package model;

public class Cartao {
	
	private int cod_cartao;
	private int numero;
	private String status;
	private int vencimento;
	private int fechamento;
	private int cod_conta;
	public Cartao() {}
	
	public Cartao(int cod_cartao, int numero, String status, int vencimento, int fechamento, int cod_conta) {
		super();
		this.cod_cartao = cod_cartao;
		this.numero = numero;
		this.status = status;
		this.vencimento = vencimento;
		this.fechamento = fechamento;
		this.cod_conta = cod_conta;
	}
	
	public int getCod_cartao() {
		return cod_cartao;
	}
	public void setCod_cartao(int cod_cartao) {
		this.cod_cartao = cod_cartao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getVencimento() {
		return vencimento;
	}
	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}
	public int getFechamento() {
		return fechamento;
	}
	public void setFechamento(int fechamento) {
		this.fechamento = fechamento;
	}
	public int getCod_conta() {
		return cod_conta;
	}
	public void setCod_conta(int cod_conta) {
		this.cod_conta = cod_conta;
	}
	
	
}
