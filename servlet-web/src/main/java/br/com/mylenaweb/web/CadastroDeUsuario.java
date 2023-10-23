package br.com.mylenaweb.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroUsuario")
public class CadastroDeUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var nome = request.getParameter("name");
		var email = request.getParameter("email");
				System.out.println("Nome " + nome + " - Email: " + email);
		System.out.println("Salvar o usuário");
		 doGet(request,response);
	}
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("sucesso.jsp");
		rd.forward(request, response);
	}

}
