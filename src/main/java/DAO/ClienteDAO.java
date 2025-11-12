package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Conta;

public class ClienteDAO extends DAO {

	public ArrayList<Conta> pegarCartoes(String cpf) {

		String sql = "Select status, nome_cliente, nome_estabelecimento from cliente cli inner join conta con on cli.cpf = ? and cli.cod_cliente = con.cod_cliente inner join estabelecimento est on con.cod_estabelecimento = est.cod_estabelecimento";
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Conta c = new Conta((contas.size() + 1), rs.getString("status"), rs.getString("nome_cliente"), rs.getString("nome_estabelecimento"));
				contas.add(c);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contas;
	}
}
