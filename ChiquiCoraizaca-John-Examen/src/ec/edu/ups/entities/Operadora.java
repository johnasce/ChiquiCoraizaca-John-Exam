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

@Entity
public class Operadora implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "operador")
	private List<Telefono> telefonos = new ArrayList<Telefono>();
	
	
	public Operadora() {
		super();
	}

	public Operadora (int id, String nombre) {
		this.setId(id);
		this.setNombre(nombre);
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
		return "Operadora : {id=" + id + ", nombre=" + nombre + ", telefono=" + telefonos + "}";
	}
	
	
}
