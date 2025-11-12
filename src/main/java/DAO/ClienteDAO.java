package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

public class ClienteDAO extends DAO {

	public void pegarCartoes(int cpf) {

		String sql = "Select * from cliente Where cpf = ?";

		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, cpf);

			//ResultSet rs = stmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
