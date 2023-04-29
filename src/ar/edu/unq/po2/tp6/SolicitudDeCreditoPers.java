package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPers extends SolicitudDeCredito {
	private double montoRequerido;
	
	public SolicitudDeCreditoPers(Cliente solicitante, double monto, double plazo, double montoRequerido) {
		super(solicitante, monto, plazo);
		this.montoRequerido = montoRequerido;
	}

	public boolean esAceptable() {
		return this.ingresosAnualesMayoresAMontoRequerido() & this.cuotaNoSuperaPorcentajeRequerido();
	}
	
	public boolean ingresosAnualesMayoresAMontoRequerido() {
		return solicitante.calcularSueldoAnual() >= montoRequerido;
	}
		
}
