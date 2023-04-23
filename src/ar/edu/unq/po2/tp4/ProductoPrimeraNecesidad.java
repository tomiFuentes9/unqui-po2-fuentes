package ar.edu.unq.po2.tp4;

import ar.edu.unq.po2.tp5.Producto;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	
	public double calcPrecio() {
		double precioBase = super.calcPrecio();
		return  precioBase - (precioBase * descuento);
	}
	
	
}
