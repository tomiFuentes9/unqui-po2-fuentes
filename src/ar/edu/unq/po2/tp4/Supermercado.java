package ar.edu.unq.po2.tp4;
import java.util.*;

import ar.edu.unq.po2.tp5.Producto;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogo;
	
	

	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto prod) {
		catalogo.add(prod);
	}

	public List<Producto> getCatalogo() {
		return catalogo;
	}
	
	public double cantTotalDeProductos() {
		return this.catalogo.size();
	}
	
	public double valorTotalDeLosProductos() {
		double res = 0;
		for(Producto prod : catalogo) {
			res += prod.calcPrecio();
		}
		return res;
	}
	
}
