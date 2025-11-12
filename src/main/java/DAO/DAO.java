package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	// Conecta ao banco de dados

	// Parâmetros de conexão

	private String driver = "org.postgresql.Driver";
	private String user = "postgres";
	private String senha = "postgres";
	private String url = "jdbc:postgresql://localhost:5432/gerenciador_cartoes";

	// Método de conexão

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = (Connection) DriverManager.getConnection(url, user, senha);
			System.out.println("Conexão realizada com sucesso.");

		} catch (Exception e) {
			System.err.print(e.getMessage());

		}
		return con;
	}

	public Connection getConnection() {
		return conectar();
	}

}
