package ec.edu.ups.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoresDAO;
import ec.edu.ups.dao.TiposDAO;
import ec.edu.ups.entities.Operadora;
import ec.edu.ups.entities.Telefono;
import ec.edu.ups.entities.Tipo;
import ec.edu.ups.entities.Usuario;



@WebServlet("/nuevoReg")
public class RegisNuevo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TiposDAO tipDAO;
	private OperadoresDAO opeDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisNuevo() {
        super();
        tipDAO = DAOFactory.getFactory().getTiposDAO();
        opeDAO = DAOFactory.getFactory().getOperadoresDao();
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

			url = "/jspinterac/nuevo_registro.jsp";
		}catch(Exception e) {
			url = "/jspinterac/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
