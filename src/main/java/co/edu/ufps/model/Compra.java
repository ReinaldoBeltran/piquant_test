package co.edu.ufps.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="compra")
public class Compra {
	
	
	
	@Id
	private Integer id_compra;

	private Integer cantidad;
	
	@OneToMany(mappedBy = "listaCompra")
	private Factura factura;
	
	private List<Producto> listProducto;
	
	private Cliente  cliente;
	
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Compra(Integer id_compra, Integer cantidad, List<Producto> listProducto, Cliente cliente) {
		super();
		this.id_compra = id_compra;
		this.cantidad = cantidad;
		this.listProducto = listProducto;
		this.cliente = cliente;
	}


	public Integer getId_compra() {
		return id_compra;
	}



	public void setId_compra(Integer id_compra) {
		this.id_compra = id_compra;
	}




	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	public List<Producto> getListProducto() {
		return listProducto;
	}


	public void setListProducto(List<Producto> listProducto) {
		this.listProducto = listProducto;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Compra [id_compra=" + id_compra + ", cantidad=" + cantidad + ", listProducto=" + listProducto
				+ ", cliente=" + cliente + "]";
	}


}
