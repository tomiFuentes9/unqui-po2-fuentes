package ar.edu.unq.po2.tp4.test;
import ar.edu.unq.po2.tp4.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.3);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(5.6), leche.calcPrecio());
	}
}
