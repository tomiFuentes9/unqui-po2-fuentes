package ar.edu.unq.po2.tp4.test;
import ar.edu.unq.po2.tp4.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoAlTrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingresoHE;
	
	
	//Hacer uml
	
	@BeforeEach
	void setUp() throws Exception {
		trabajador = new Trabajador();
		ingreso1 = new Ingreso(4, "Sueldo Abril", 500);
		ingreso2 = new Ingreso(2, "Bonus PEG Febrero", 250);
		ingresoHE = new IngresoHorasExtra(3, "Horas extra marzo", 150, 4);		
	}

	@Test
	void testTrabajador() {
		trabajador.agregarIngreso(ingreso1);
		assertEquals(500, trabajador.getTotalPercibido());
		
		trabajador.agregarIngreso(ingreso2);
		assertEquals(750, trabajador.getTotalMontoImponible());
		
		trabajador.agregarIngreso(ingresoHE);
		assertEquals(900, trabajador.getTotalPercibido());
		assertEquals(750, trabajador.getTotalMontoImponible());
		assertEquals(15 , trabajador.getImpuestoAPagar());
		
	}
	
	

}
