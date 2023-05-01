package ar.edu.unq.po2.tp6.test;
import ar.edu.unq.po2.tp6.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestBanco {
	private Banco viellesuper;
	private Cliente pam;
	private Cliente jim;
	private PropiedadInmobiliaria duplex;
	private PropiedadInmobiliaria tinglado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		viellesuper = new Banco(0.7, 0.5, 15000, 0.7);
		pam = new Cliente("Pamela", "Beasley", "Lavalle 141", 26, 1500, 0, duplex, viellesuper);
		jim = new Cliente("Jim", "Halpert", "Lavalle 144", 28, 2000, 0, tinglado, viellesuper);
		duplex = new PropiedadInmobiliaria("Es un duplex con 2 ventanas y 2 puertas", "Lavalle 141", 500000);
		tinglado = new PropiedadInmobiliaria("4 vigas y un techo de chapa", "Ladrigorni 76", 75000);
	}
	
	@Test
	void testRecibirSolicitudCreditoPersonal() {
		pam.desarrollarSolicitudPers(8000, 10, pam);
		assertFalse(viellesuper.getSolicitudes().isEmpty());
		assertEquals(viellesuper.getSolicitudes().get(0).getSolicitante(), pam);		
	}
	
	@Test
	void testRecibirSolicitudCreditoHipotecario() {
		jim.desarrollarSolicitudHipo(9000, 20, jim, tinglado);
		assertFalse(viellesuper.getSolicitudes().isEmpty());
		assertEquals(viellesuper.getSolicitudes().get(0).getSolicitante(), jim);
	}
	
	@Test
	void testSolicitudAceptada() {
		pam.desarrollarSolicitudPers(8000, 10, pam);
		viellesuper.otorgarCreditoSiCorresponde(viellesuper.getSolicitudes().get(0));
		assertEquals(pam.revisarSaldo(), 8000);
	}
	
	@Test
	void testSolicitudRechazada() {
		jim.desarrollarSolicitudHipo(90000, 20, jim, tinglado);
		viellesuper.otorgarCreditoSiCorresponde(viellesuper.getSolicitudes().get(0));
		assertEquals(jim.revisarSaldo(), 0);
	}

}
