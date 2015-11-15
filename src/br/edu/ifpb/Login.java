package br.edu.ifpb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login.do")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("name");
		String senha = request.getParameter("senha");
		
		if ((nome.equals("admin") && (senha.equals("admin")))){
			response.sendRedirect("http://localhost:8080/Biblioteca1/Admin.jsp");
		}else{
			response.sendRedirect("http://localhost:8080/Biblioteca1/Index.jsp");
		}
	}

}
