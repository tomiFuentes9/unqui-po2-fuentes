package ar.edu.unq.po2.tp4.test;
import ar.edu.unq.po2.tp4.*;
import ar.edu.unq.po2.tp5.Producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.cantTotalDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.cantTotalDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(new Double(0), supermercado.valorTotalDeLosProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(new Double(93.9), supermercado.valorTotalDeLosProductos());
	}
}
