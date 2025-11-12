package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Conta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

	class CpfRequest {
		String cpf;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		BufferedReader reader = request.getReader();
		Gson gson = new Gson();

		CpfRequest req = gson.fromJson(reader, CpfRequest.class);
		String cpf = req.cpf;

		ClienteDAO dao = new ClienteDAO();
		ArrayList<Conta> contas = dao.pegarCartoes(cpf);

		PrintWriter writer = response.getWriter();
		String json = gson.toJson(contas);
		writer.print(json);
		writer.flush();

	}

}
