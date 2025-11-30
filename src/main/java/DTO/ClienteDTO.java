package DTO;

import model.Cliente;

public class ClienteDTO {
	public int cod_cliente;
	public String nome_cliente;
	public int cpf;
	
	public ClienteDTO() {}
	
	public ClienteDTO(int cod_cliente, String nome_cliente, int cpf) {
		this.cod_cliente = cod_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
	}
	
	public ClienteDTO(Cliente c) {this.cod_cliente = c.getCod_cliente();
		this.nome_cliente = c.getNome_cliente();
		this.cpf = c.getCpf();
	}
	
	
}
