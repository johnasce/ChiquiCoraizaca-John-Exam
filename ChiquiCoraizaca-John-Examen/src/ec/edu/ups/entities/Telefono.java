package ec.edu.ups.entities;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Telefono implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numero;

	@ManyToOne
	@JoinColumn
	private Operadora operador;
	
	@ManyToOne
	@JoinColumn
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	
	/*
	 * Constructor para pasarle parametros desde otras clases*/
	public Telefono (int id, String numero, Operadora operador, Tipo tipo, Usuario usuario) {
		this.setId(id);
		this.setNumero(numero);
		this.setOperadora(operador);
		this.setTipo(tipo);
		this.setUsuario(usuario);
	}
	
	/*
	 Constructor vacion Requerido*/
	public Telefono() {
		super();
	}

	/*
	 Setters and Getters para modificar los atributos del objeto*/
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Operadora getOperador() {
		return operador;
	}


	public void setOperadora(Operadora operador) {
		this.operador = operador;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	@Override
	public String toString() {
		return "Telefono {id=" + id + ", numero=" + numero + ", operador=" + operador + ", tipo=" + tipo + "}";
	}
	
	
	
}
