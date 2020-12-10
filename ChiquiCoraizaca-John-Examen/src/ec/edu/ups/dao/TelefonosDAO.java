package ec.edu.ups.dao;

import java.util.List;

// IMPORTAR LA CLASE TELEFONO DEL PAQUETE ENTITIES
import ec.edu.ups.entities.Telefono;

public interface TelefonosDAO extends GenericcDAO<Telefono, Integer>{

	List<Telefono> findCed(String cedula);

	List<Telefono> findNumero(String numero);

}
