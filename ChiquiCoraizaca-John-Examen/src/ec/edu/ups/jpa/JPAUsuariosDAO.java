package ec.edu.ups.jpa;

import ec.edu.ups.dao.UsuariosDAO;
import ec.edu.ups.entities.Usuario;

public class JPAUsuariosDAO extends JPAGenericDAO<Usuario, Integer> implements UsuariosDAO{

	public JPAUsuariosDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Usuario readCed(String cedula) {
		Usuario usu=null;
        String consulta="Select u From Usuario u Where u.cedula =:ced";
        try {
            usu=(Usuario) em.createQuery(consulta).setParameter("ced", cedula).getSingleResult();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return usu;
	}

	@Override
	public void loquesea(String correo) {
		
	}


}
