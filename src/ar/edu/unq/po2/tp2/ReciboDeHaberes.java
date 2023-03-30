package ar.edu.unq.po2.tp2;

public abstract class ReciboDeHaberes {
	
	private String nombreEmp;
	private String direccion;
	private String fechaEmision;
	private float sBruto;
	private float sNeto;
	private float obraSocial;
	private float aportesJub;
	public ReciboDeHaberes(String nombreEmp, String direccion, String fechaEmision, float sBruto, float sNeto,
			float obraSocial, float aportesJub) {
		super();
		this.nombreEmp = nombreEmp;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sBruto = sBruto;
		this.sNeto = sNeto;
		this.obraSocial = obraSocial;
		this.aportesJub = aportesJub;
	}
	
	
}
