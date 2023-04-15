package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	
	public double calcPrecio() {
		return super.calcPrecio() - (super.calcPrecio() * descuento);
	}
	
	
}