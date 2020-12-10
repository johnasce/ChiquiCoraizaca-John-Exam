package ec.edu.ups.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonosDAO;
import ec.edu.ups.entities.Telefono;

@WebServlet("/mostrarNumeros")
public class MostrarNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonosDAO telefDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarNumeros() {
        super();
        telefDAO = DAOFactory.getFactory().getTelefonosDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url=null;
		try {
			
			List<Telefono> listTel= telefDAO.findAll();

			request.setAttribute("listaTel", listTel);
			
			url = "/jspinterac/mostrar.jsp";
		}catch(Exception e) {
			url = "/jspinterac/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	
	
	}

}
