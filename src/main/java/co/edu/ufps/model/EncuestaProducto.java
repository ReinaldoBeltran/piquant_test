package co.edu.ufps.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="encuesta_producto")
public class EncuestaProducto {

	@Id
	private Integer id_encuesta_producto;
	
	private Integer puntaje;
	
	private Producto producto1;

	public EncuestaProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EncuestaProducto(Integer id_encuesta_producto, Integer puntaje, Producto producto1) {
		super();
		this.id_encuesta_producto = id_encuesta_producto;
		this.puntaje = puntaje;
		this.producto1 = producto1;
	}

	public Integer getId_encuesta_producto() {
		return id_encuesta_producto;
	}

	public void setId_encuesta_producto(Integer id_encuesta_producto) {
		this.id_encuesta_producto = id_encuesta_producto;
	}

	public Integer getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	@Override
	public String toString() {
		return "EncuestaProducto [id_encuesta_producto=" + id_encuesta_producto + ", puntaje=" + puntaje
				+ ", producto1=" + producto1 + "]";
	}
	
	
	
	
}
