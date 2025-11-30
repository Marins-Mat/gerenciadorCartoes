package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import DAO.ContaDAO;
import DTO.ContaDTO;

@WebServlet("/ExibeConta")
public class ExibeContaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ExibeContaServlet() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	class identificadorConta {
		int cod_cliente;
		int cod_estabelecimento;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		BufferedReader reader = request.getReader();
		Gson gson = new Gson();
		identificadorConta iden = gson.fromJson(reader, identificadorConta.class);
		
		
		int cod_cliente = iden.cod_cliente;
		int cod_estabelecimento = iden.cod_estabelecimento;
		
		
		ContaDAO dao = new ContaDAO();
		ContaDTO conta = dao.pegarDados(cod_cliente, cod_estabelecimento); 
		String json = gson.toJson(conta);
		
		PrintWriter writer = response.getWriter();
		writer.print(json);
		writer.flush();
		writer.close();
		
	}

}
