package ec.edu.ups.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * Clase o Entidad del Tipo de TElefono que se utilizara*/
@Entity
public class Tipo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	private List<Telefono> telefonos = new ArrayList<Telefono>();
	
	/*
	 Constructor para Pasar parametros a la entitdad Tipo*/
	public Tipo (int id, String nombre) {
		this.setId(id);
		this.setNombre(nombre);
	}
	
	/*
	 Constructor vacio requerido*/
	public Tipo() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Tipo: {id=" + id + ", nombre=" + nombre + ", telefono=" + telefonos + "}";
	}
	
	
	
}
