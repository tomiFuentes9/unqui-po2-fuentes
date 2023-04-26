package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	private Cliente solicitante;
	private double monto;
	private double plazo;
	
	public SolicitudDeCredito(Cliente solicitante, double monto, double plazo) {
		super();
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public abstract boolean esAceptable();
	
	
}


