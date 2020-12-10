package ec.edu.ups.dao;

// IMPORTAR LA CLASE USUARIO del paquete entities
import ec.edu.ups.entities.Usuario;

public interface UsuariosDAO extends GenericcDAO<Usuario, Integer>{

	Usuario readCed(String cedula);

	void loquesea(String correo);

}
