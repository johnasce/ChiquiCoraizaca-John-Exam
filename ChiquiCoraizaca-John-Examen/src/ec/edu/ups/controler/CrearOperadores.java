package ec.edu.ups.controler;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoresDAO;
import ec.edu.ups.entities.Operadora;

public class CrearOperadores {
	
    public static void main(String[]args) {
    	OperadoresDAO operadoraDAO;
    	operadoraDAO= DAOFactory.getFactory().getOperadoresDao();
       
    	Operadora operadora1 = new Operadora(0, "Tuenti");
    	Operadora operadora2 = new Operadora(0, "Claro");
    	Operadora operadora3 = new Operadora(0, "Movistar");
    	Operadora operadora4 = new Operadora(0, "BellSouth");
    	
    	
    	operadoraDAO.create(operadora1);
    	operadoraDAO.create(operadora2);
    	operadoraDAO.create(operadora3);
    	operadoraDAO.create(operadora4);
    	
    }
    
}
