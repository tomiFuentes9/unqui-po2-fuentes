package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso{
	private double cantHorasExtra;

	
	public IngresoHorasExtra(double mesDePercepción, String concepto, double monto, double cantHorasExtra) {
		super(mesDePercepción, concepto, monto);
		this.cantHorasExtra = cantHorasExtra;
	}



	public double getCantHorasExtra() {
		return cantHorasExtra;
	}
	
	public double montoImponible() {
		return 0;
	}
}
