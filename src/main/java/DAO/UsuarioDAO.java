package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Usuario;

public class UsuarioDAO extends DAO {

	public Usuario validarUsuario(String login, String senha) {
		String sql = "Select * from usuario Where login = ? And senha = ?";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = (con.prepareStatement(sql));
			stmt.setString(1, login);
			stmt.setString(2, senha);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Usuario usr = new Usuario();
				usr.setNome(rs.getString("nome_usuario"));
				usr.setLogin(rs.getString("login"));
				return usr;
			} else {
				return null;
			}

		} catch (Exception e) {
			return null;
		}
	}

}