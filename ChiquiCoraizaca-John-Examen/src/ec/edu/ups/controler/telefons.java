package ec.edu.ups.controler;

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

@WebServlet("/telefons")
public class telefons extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TiposDAO tipDAO;
	private OperadoresDAO opeDAO;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public telefons() {
        super();
        tipDAO = DAOFactory.getFactory().getTiposDAO();
        opeDAO = DAOFactory.getFactory().getOperadoresDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=null;
		try {
			
			int num = Integer.parseInt(request.getParameter("num"));
			
			List<Tipo> listTip= tipDAO.findAll();
			List<Operadora> listOpe= opeDAO.findAll();
			
			request.setAttribute("listaTip", listTip);
			request.setAttribute("listaOpe", listOpe);
			request.setAttribute("numeros", num);
			
			
			System.out.println(listTip);
			System.out.println(listOpe);
			
			
			
			url = "/jspinterac/numeros.jsp";
		}catch(Exception e) {
			url = "/jspinterac/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
	}

}
