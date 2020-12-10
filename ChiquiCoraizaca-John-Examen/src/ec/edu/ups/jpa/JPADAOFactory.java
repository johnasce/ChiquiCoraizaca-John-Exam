package ec.edu.ups.jpa;


import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoresDAO;
import ec.edu.ups.dao.TelefonosDAO;
import ec.edu.ups.dao.TiposDAO;
import ec.edu.ups.dao.UsuariosDAO;


public class JPADAOFactory extends DAOFactory{


	@Override
	public OperadoresDAO getOperadoresDao() {
		// TODO Auto-generated method stub
		return new JPAOperadoresDAO();
	}

	@Override
	public TiposDAO getTiposDAO() {
		// TODO Auto-generated method stub
		return new JPATiposDAO();
	}
	
	@Override
	public UsuariosDAO getUsuariosDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuariosDAO();
	}

	@Override
	public TelefonosDAO getTelefonosDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonosDAO();
	}



}
