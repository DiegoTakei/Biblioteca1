package br.edu.ifpb;

import java.io.IOException;
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
		VolumeDAO dao = new VolumeDAO();
		
		volume.setAno_publicacao(request.getParameter("publicacao"));
		volume.setDescricao(request.getParameter("descricao"));
		volume.setEditora(request.getParameter("editora"));
		volume.setTipo_volume(request.getParameter("tipo"));
		volume.setTitulo(request.getParameter("titulo"));
		volume.setPags(Integer.parseInt(request.getParameter("paginas")));
		volume.setAutor(request.getParameter("autor"));
		
		dao.insert(volume);
		
		response.sendRedirect("http://localhost:8080/Biblioteca1/Admin.jsp");
		
		
	}

}
