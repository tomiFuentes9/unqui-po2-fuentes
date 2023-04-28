package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPers extends SolicitudDeCredito {
	private double montoRequerido;
	private double porcentajeRequerido;
	
	public SolicitudDeCreditoPers(Cliente solicitante, double monto, double plazo) {
		super(solicitante, monto, plazo);
	}
	
	public boolean esAceptable() {
		return this.ingresosAnualesMayoresAMontoRequerido() & this.cuotaNoSuperaPorcentajeRequerido();
	}
	
	public boolean ingresosAnualesMayoresAMontoRequerido() {
		return this.getSolicitante().calcularSueldoAnual() >= montoRequerido;
	}
	
	public boolean cuotaNoSuperaPorcentajeRequerido() {
		return this.valorDeCuota() <=  this.getSolicitante().getSueldoNetoMensual() * porcentajeRequerido;
	}
		
}
