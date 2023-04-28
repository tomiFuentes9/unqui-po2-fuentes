package ar.edu.unq.po2.tp6.test;
import ar.edu.unq.po2.tp6.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestBanco {
	private Banco viellesuper;
	private String pam;
	private Cliente jim;
	private Cliente dwight;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//viellesuper = new Banco() Cambiar por constructor
		pam = mock(String.class);
		//jim = mock(Cliente.class)
		//dwight = mock(Cliente.class)
	}

	@Test
	void testConClientes() {
		fail("Not yet implemented");
	}
	
	void testRecibirSolicitudCredito() {
		fail("Not yet implemented");
	}
	
	void testRecibirSolicitudCreditoPersonal() {
		fail("Not yet implemented");
	}
	
	void testRecibirSolicitudCreditoHipotecario() {
		fail("Not yet implemented");
	}
	
	void testSolicitudAceptada() {
		fail("Not yet implemented");
	}
	
	void testSolicitudRechazada() {
		fail("Not yet implemented");
	}

}
