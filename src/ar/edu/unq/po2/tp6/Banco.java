package ar.edu.unq.po2.tp6;

import java.util.*;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	
	
	public Banco(List<Cliente> clientes) {
		super();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void solicitudDeCreditoPersonal(Cliente cl) {
		
	}
	
	public void solicitudDeCreditoHipotecario(Cliente cl) {
		
	}


	public void añadirCliente(Cliente cl) {
		clientes.add(cl);
	}
}
