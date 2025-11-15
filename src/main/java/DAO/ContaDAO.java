package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Conta;

public class ContaDAO extends DAO{
	public Conta pegarDados(int cod_cliente, int cod_estabelecimento) {
		String sql = "Select nome_cliente, nome_estabelecimento, status, limite_conta, consumo_conta from cliente cli inner join conta con on cli.cod_cliente = ? and con.cod_cliente=cli.cod_cliente inner join estabelecimento est on est.cod_estabelecimento = ? and con.cod_estabelecimento = est.cod_estabelecimento";
		
		try {
			Connection con = getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cod_cliente);
			stmt.setInt(2, cod_estabelecimento);
			
			ResultSet rs = stmt.executeQuery();
			Conta dadosConta = new Conta();
			
			return dadosConta;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
