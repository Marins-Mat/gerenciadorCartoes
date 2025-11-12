package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

import com.google.gson.Gson;

import DAO.ClienteDAO;


@WebServlet("/buscaClienteServlet")
public class buscaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public buscaClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		BufferedReader reader = request.getReader();
		Gson gson = new Gson();

		int cpf = gson.fromJson(reader, Integer.class);

		ClienteDAO dao = new ClienteDAO();

		dao.pegarCartoes(cpf);

	}

}
