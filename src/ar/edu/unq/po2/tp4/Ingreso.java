package ar.edu.unq.po2.tp4;

public class Ingreso {
	private double mesDePercepción;
	private String concepto;
	private double monto;
	
	public Ingreso(double mesDePercepción, String concepto, double monto) {
		super();
		this.mesDePercepción = mesDePercepción;
		this.concepto = concepto;
		this.monto = monto;
	}

	public double getMesDePercepción() {
		return mesDePercepción;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getMonto() {
		return monto;
	}
	
	public double montoImponible() {
		return monto;
	}
	
	
}
