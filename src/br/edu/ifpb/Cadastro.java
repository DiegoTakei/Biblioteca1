package br.edu.ifpb;

import java.io.IOException;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet(name = "Cadastro.java", urlPatterns = { "/Cadastro.do" })
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Volume volume = new Volume();
		volume.setAno_publicacao(request.getParameter(null));
		volume.setDescricao(request.getParameter(null));
		volume.setEditora(request.getParameter(null));
		volume.setTipo_volume(request.getParameter(null));
		volume.setTitulo(request.getParameter(null));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();    
		manager.persist(volume);
		manager.getTransaction().commit();  
	}

}
