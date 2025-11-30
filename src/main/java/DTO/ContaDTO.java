package DTO;

import model.Conta;

public class ContaDTO {
	public String nome_cliente;
	public double limite_total;
	public double consumo_total;
	public String nome_estabelecimento;
	public String status;
	
	
	
	public ContaDTO(String nome_cliente, double limite_total, double consumo_total, String nome_estabelecimento,
			String status) {
		
		this.nome_cliente = nome_cliente;
		this.limite_total = limite_total;
		this.consumo_total = consumo_total;
		this.nome_estabelecimento = nome_estabelecimento;
		this.status = status;
	}
	
	public ContaDTO(Conta co) {
		this.nome_cliente = co.getNome_cliente();
		this.limite_total = co.getLimite_total();
		this.consumo_total = co.getConsumo_total();
		this.nome_estabelecimento = co.getNome_estabelecimento();
		this.status = co.getStatus();
	}
	
	public ContaDTO() {}
	
	
}
