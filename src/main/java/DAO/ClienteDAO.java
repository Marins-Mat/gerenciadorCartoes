package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO extends DAO {

	public void pegarCartoes(String cpf) {

		String sql = "Select status, nome_cliente, nome_estabelecimento from cliente cli inner join conta con on cli.cpf = ? and cli.cod_cliente = con.cod_cliente inner join estabelecimento est on con.cod_estabelecimento = est.cod_estabelecimento";

		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);

			ResultSet rs = stmt.executeQuery();

			if (!rs.next()) {
				System.out.println("Nada encontrado");

			} else {
				for (int i = 0; i < 3; i++) {
					System.out.println("");
					System.out.println(rs.getString("nome_cliente"));
					System.out.println("");
					System.out.println(rs.getString("status"));
					System.out.println("");
					System.out.println(rs.getString("nome_estabelecimento"));
					System.out.println("");
					System.out.println("");
					rs.next();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
