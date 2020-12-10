package ec.edu.ups.jpa;

import ec.edu.ups.dao.TiposDAO;
import ec.edu.ups.entities.Tipo;

public class JPATiposDAO extends JPAGenericDAO<Tipo, Integer> implements TiposDAO{

	public JPATiposDAO() {
		super(Tipo.class);
		// TODO Auto-generated constructor stub
	}
	

}
