package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;

@WebServlet("/ServletCadastrarUsuario")
public class ServletCadastrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DAO dao = new DAO();
	ArrayList<String> municipios = new ArrayList<>();

    public ServletCadastrarUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		municipios = dao.popularCombobox();
		
		request.setAttribute("municipios", municipios);
		
		request.getRequestDispatcher("jsp/cadastrarUsuario.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
