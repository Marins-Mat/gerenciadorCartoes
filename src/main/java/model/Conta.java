package model;

public class Conta {
	private int cod_conta;
	private String status;
	private String nome_cliente;
	private String nome_estabelecimento;
	

	public Conta(int cod_conta, String status, String nome_cliente, String nome_estabelecimento) {
		this.cod_conta = cod_conta;
		this.status = status;
		this.nome_cliente = nome_cliente;
		this.nome_estabelecimento = nome_estabelecimento;
	}
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return cod_conta;
	}
	public void setId(int id) {
		this.cod_conta = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getNome_estabelecimento() {
		return nome_estabelecimento;
	}
	public void setNome_estabelecimento(String nome_estabelecimento) {
		this.nome_estabelecimento = nome_estabelecimento;
	}
	
	public String toString() {
		return "Código da conta: " + cod_conta + " Status da conta: " + status + " Nome do cliente: " + nome_cliente + " Nome do estabelecimento: " + nome_estabelecimento;
	}
}
