package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipo extends SolicitudDeCredito{

	public SolicitudDeCreditoHipo(Cliente solicitante, double monto, double plazo) {
		super(solicitante, monto, plazo);
	}
	
	public boolean esAceptable() {
		return false;
	}
	
	
}
