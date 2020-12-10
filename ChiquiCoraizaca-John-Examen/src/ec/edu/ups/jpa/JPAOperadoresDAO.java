package ec.edu.ups.jpa;

import ec.edu.ups.dao.OperadoresDAO;
import ec.edu.ups.entities.Operadora;

public class JPAOperadoresDAO extends JPAGenericDAO<Operadora, Integer> implements OperadoresDAO{
	
	public JPAOperadoresDAO() {
		super(Operadora.class);
	}

}
