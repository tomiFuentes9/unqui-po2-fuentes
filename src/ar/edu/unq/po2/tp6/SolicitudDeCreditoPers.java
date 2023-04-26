package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPers extends SolicitudDeCredito {

	public SolicitudDeCreditoPers(Cliente solicitante, double monto, double plazo) {
		super(solicitante, monto, plazo);
	}
	
	public boolean esAceptable() {
		return false;
	}
	
	
	
}
