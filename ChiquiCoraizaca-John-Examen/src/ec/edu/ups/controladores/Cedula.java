package ec.edu.ups.controladores;

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

/**
 * Servlet implementation class bucarPorCedula
 */
@WebServlet("/bucarPorCedula")
public class Cedula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TelefonosDAO telDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cedula() {
        super();
        telDAO = DAOFactory.getFactory().getTelefonosDAO();
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
			
			String cedula = request.getParameter("cedula");
			
			
			
			List<Telefono> listTel= telDAO.findCed(cedula);
			request.setAttribute("listaTel", listTel);
			
			url = "/Invitados/lista.jsp";
		}catch(Exception e) {
			url = "/Invitados/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
