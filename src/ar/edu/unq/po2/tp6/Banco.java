package ar.edu.unq.po2.tp6;

import java.util.*;

public class Banco {
	private List<Cliente> clientes;
	
	
	public Banco(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}


	public void añadirCliente(Cliente cl) {
		clientes.add(cl);
	}
}
