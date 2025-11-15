package model;

public class Conta {
	private int cod_conta;
	private String nome_cliente;
	private int cod_cliente;
	private String nome_estabelecimento;
	private int cod_estabelecimento;
	private String status;
	

	public Conta(int cod_conta, int cod_cliente, String nome_cliente, String nome_estabelecimento, int cod_estabelecimento, String status) {
		this.cod_conta = cod_conta;
		this.status = status;
		this.cod_cliente = cod_cliente;
		this.nome_cliente = nome_cliente;
		this.cod_estabelecimento=cod_estabelecimento;
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
	public int getCod_conta() {
		return cod_conta;
	}

	public void setCod_conta(int cod_conta) {
		this.cod_conta = cod_conta;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getCod_estabeleciemento() {
		return cod_estabelecimento;
	}

	public void setCod_estabeleciemento(int cod_estabeleciemento) {
		this.cod_estabelecimento = cod_estabeleciemento;
	}

	public String toString() {
		return "Código da conta: " + cod_conta + " Cod do cliente: " + cod_cliente + " Nome do cliente: " + nome_cliente + " Codigo do estabelecimento: " + cod_estabelecimento + " Nome do estabelecimento: " + nome_estabelecimento + " Status da conta: " + status ;
	}
}
