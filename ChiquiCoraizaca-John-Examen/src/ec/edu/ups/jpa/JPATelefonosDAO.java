package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TelefonosDAO;
import ec.edu.ups.entities.Telefono;
import ec.edu.ups.entities.Usuario;

public class JPATelefonosDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonosDAO{

	public JPATelefonosDAO() {
		super(Telefono.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Telefono> findCed(String cedula) {
		List<Telefono> tel=null;
        String consulta="select t from Telefono t , Usuario u where t.usuario = u and u.cedula =:cedula";
        try {
        	tel = (List<Telefono>) em.createQuery(consulta).setParameter("cedula", cedula).getResultList();
        	
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return tel;
	}

	@Override
	public List<Telefono> findNumero(String numero) {
		List<Telefono> tel=null;
        String consulta="select t from Telefono t where t.numero =:numero ";
        try {
        	tel = (List<Telefono>) em.createQuery(consulta).setParameter("numero", numero).getResultList();
        	
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return tel;
	}

}
