package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.ContaDTO;
import model.Conta;



public class ContaDAO extends DAO{
	
	
	public ContaDTO pegarDados(int cod_cliente, int cod_estabelecimento) {
		String sql = "Select nome_cliente, nome_estabelecimento, status, limite_total, consumo_total from cliente cli inner join conta con on cli.cod_cliente = ? and con.cod_cliente=cli.cod_cliente inner join estabelecimento est on est.cod_estabelecimento = ? and con.cod_estabelecimento = est.cod_estabelecimento";
		
		try {
			Connection con = getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cod_cliente);
			stmt.setInt(2, cod_estabelecimento);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				ContaDTO conta = new ContaDTO(rs.getString("nome_cliente"), rs.getDouble("limite_total"), rs.getDouble("consumo_total"), rs.getString("nome_estabelecimento"), rs.getString("status"));
				return conta;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public ArrayList<ContaDTO> listarContas(String cpf) {

		String sql = "Select nome_cliente, cli.cod_cliente, nome_estabelecimento, est.cod_estabelecimento, status from cliente cli inner join conta con on cli.cpf = ? and cli.cod_cliente = con.cod_cliente inner join estabelecimento est on con.cod_estabelecimento = est.cod_estabelecimento";
		ArrayList<ContaDTO> dtos = new ArrayList<ContaDTO>();
		
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Conta c = new Conta((dtos.size() + 1), rs.getInt("cod_cliente"), rs.getString("nome_cliente"), rs.getString("nome_estabelecimento"), rs.getInt("cod_estabelecimento"), 0, 0, rs.getString("status"));
				dtos.add(new ContaDTO(c));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
	
}
