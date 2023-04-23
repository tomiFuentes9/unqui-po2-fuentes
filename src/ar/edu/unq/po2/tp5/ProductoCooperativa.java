package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
	
	
	public ProductoCooperativa(String nombre, double precio) {
		super(nombre, precio);
	}

	
	public boolean esCooperativa() {
		return true;
	}
	
	public double getMontoAPagar() {
		return precio * 0.9;
	}
	

}
