package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito{
	protected Cliente solicitante;
	protected double monto;
	protected double plazo;
	protected double porcentajeRequerido;
	
	public SolicitudDeCredito(Cliente solicitante, double monto, double plazo, double porcentajeRequerido) {
		super();
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazo = plazo;
		this.porcentajeRequerido = porcentajeRequerido;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	public double getMonto() {
		return monto;
	}

	public double valorDeCuota() {
		return monto / plazo ;
	}
	
	public abstract boolean esAceptable();
	
	public boolean cuotaNoSuperaPorcentajeRequerido() {
		return this.valorDeCuota() <=  solicitante.getSueldoNetoMensual() * porcentajeRequerido;
	}
}


