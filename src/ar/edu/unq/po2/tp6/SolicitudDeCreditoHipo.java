package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipo extends SolicitudDeCredito{
	private PropiedadInmobiliaria jauz;

	public SolicitudDeCreditoHipo(Cliente solicitante, double monto, double plazo, PropiedadInmobiliaria jauz) {
		super(solicitante, monto, plazo);
		this.jauz = jauz;
	}

	public boolean esAceptable() {
		return false;
	}
	
	
}
