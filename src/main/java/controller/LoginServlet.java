package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import com.google.gson.Gson;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		BufferedReader reader = request.getReader();
		Gson gson = new Gson();
		UsuarioDTO usrDTO = gson.fromJson(reader, UsuarioDTO.class);

		String login = usrDTO.login;
		String senha = usrDTO.senha;

		UsuarioDAO userDAO = new UsuarioDAO();
		UsuarioDTO usr = userDAO.validarUsuario(login, senha);

		boolean valido = usr != null;
		
		PrintWriter writer = response.getWriter();
		String json = gson.toJson(Map.of("sucesso", valido));
		writer.print(json);
		writer.flush();
		writer.close();

	}

}
