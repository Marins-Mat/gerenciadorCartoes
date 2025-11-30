package model;

public class Cliente {
	private int cod_cliente;
	private String nome_cliente;
	private int cpf;
	
	
	public Cliente() {}
	
	public Cliente(int cod_cliente, String nome_cliente, int cpf) {
		super();
		this.cod_cliente = cod_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
	}
	
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
