package ar.edu.unq.po2.tp6;

import java.util.*;

public class Banco implements Desarrollables{
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudes;
	private double porcRequeridoPers;
	private double porcRequeridoHipo;
	private double montoRequerido;
	private double porcValorFiscalInmuRequerido;
	
	public Banco(double porcRequeridoPers,double porcRequeridoHipo, double montoRequerido, 
			     double porcValorFiscalInmuRequerido) {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
		this.porcRequeridoPers = porcRequeridoPers;
		this.porcRequeridoHipo = porcRequeridoHipo;
		this.montoRequerido = montoRequerido;
		this.porcValorFiscalInmuRequerido = porcValorFiscalInmuRequerido;
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}

	public void desarrollarSolicitudPers(double monto, double plazo, Cliente cl) {
		SolicitudDeCredito solicitud = new SolicitudDeCreditoPers(cl, monto, plazo, porcRequeridoPers, montoRequerido);
		solicitudes.add(solicitud);
	}
	
	public void desarrollarSolicitudHipo(double monto, double plazo, Cliente cl, PropiedadInmobiliaria inmu) {
		SolicitudDeCredito solicitud = new SolicitudDeCreditoHipo(cl, monto, plazo, porcRequeridoHipo, inmu, porcValorFiscalInmuRequerido);
		solicitudes.add(solicitud);
	}
	
	public void otorgarCreditoSiCorresponde(SolicitudDeCredito sc) {
		if (this.verificarSolicitud(sc)) {
			sc.getSolicitante().recibirGuita(sc.getMonto());
		} else {
			throw new RuntimeException("No fue aprobada tu solicitud");
		}
	}

	public boolean verificarSolicitud(SolicitudDeCredito sc) {
		return sc.esAceptable();
	}


	public void añadirCliente(Cliente cl) {
		clientes.add(cl);
	}
}
