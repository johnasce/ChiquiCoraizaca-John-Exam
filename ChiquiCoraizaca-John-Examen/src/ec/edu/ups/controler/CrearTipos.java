package ec.edu.ups.controler;

import ec.edu.ups.dao.TiposDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entities.Tipo;

public class CrearTipos {
	public static void main(String[] args) {
		TiposDAO tipDAO=DAOFactory.getFactory().getTiposDAO();
		
		// Instanciar una clase para crear un objeto tipo en la base de datos
		Tipo tipoOperadora1 = new Tipo(0, "MOVIL");
		// Instanciar una clase para crear un objeto tipo en la base de datos
		Tipo tipoOperadora2 = new Tipo(0, "FIJO");
		
		// mandar como parametro al metodo de crear para que se cree un tipo de operadora
		tipDAO.create(tipoOperadora1);
		// mandar como parametro al metodo de crear para que se cree un tipo de operadora
		tipDAO.create(tipoOperadora2);
	}
}
