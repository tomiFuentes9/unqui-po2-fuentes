package ar.edu.unq.po2.tp2;

public class ReciboDeHabEmpTemp extends ReciboDeHaberes{
	private double horasExtra;

	public ReciboDeHabEmpTemp(String nombreEmp, String direccion, String fechaEmision, float sBruto, float sNeto,
			float obraSocial, float aportesJub, double horasExtra) {
		super(nombreEmp, direccion, fechaEmision, sBruto, sNeto, obraSocial, aportesJub);
		this.horasExtra = horasExtra;
	}

	
	
}
