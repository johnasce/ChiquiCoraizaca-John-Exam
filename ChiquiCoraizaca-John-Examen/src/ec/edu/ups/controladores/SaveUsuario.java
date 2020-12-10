package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoresDAO;
import ec.edu.ups.dao.TelefonosDAO;
import ec.edu.ups.dao.TiposDAO;
import ec.edu.ups.dao.UsuariosDAO;
import ec.edu.ups.entities.Operadora;
import ec.edu.ups.entities.Telefono;
import ec.edu.ups.entities.Tipo;
import ec.edu.ups.entities.Usuario;

/**
 * Servlet implementation class guardarUsuario
 */
@WebServlet("/guardarUsuario")
public class SaveUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TiposDAO tipDAO;
	private OperadoresDAO opeDAO; 
	private UsuariosDAO usuDAO;
	private TelefonosDAO telDAO;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUsuario() {
        super();
        tipDAO = DAOFactory.getFactory().getTiposDAO();
        opeDAO = DAOFactory.getFactory().getOperadoresDao();
        usuDAO = DAOFactory.getFactory().getUsuariosDAO();
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
		
			String nom = request.getParameter("nombre");
			String ape = request.getParameter("apellido");
			String cedula = request.getParameter("cedula");
			String correo = request.getParameter("correo");
			String contra = request.getParameter("contra");
			
			Usuario usu = new Usuario(0, cedula, nom, ape, correo, contra);
			
			usuDAO.create(usu);
			
			Usuario usuA = usuDAO.readCed(cedula);
			
			usuDAO.loquesea(correo);
			
			int num = Integer.parseInt(request.getParameter("telfs"));
			
			System.out.println(usuA);
			
			for (int i=0; i< num ;i++){
				
				String numero = request.getParameter("numero"+i);
				int numT = Integer.parseInt(request.getParameter("tipo"+i));
				int numO = Integer.parseInt(request.getParameter("opera"+i));
				
				Operadora operador = opeDAO.read(numO);
				Tipo tipo = tipDAO.read(numT);
				
				
				Telefono telf = new Telefono(0, numero, operador, tipo, usuA);
				
				telDAO.create(telf);
				
				
				System.out.println(numero+"|"+numT+"|"+numO);
			}
			
			
			url = "/Invitados/exitoCrear.jsp";
		}catch(Exception e) {
			url = "/Invitados/error.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
