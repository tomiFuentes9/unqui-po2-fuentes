package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;

public class ReciboDeHabEmpPerm extends ReciboDeHaberes{
	private double asignPorHijo;
	private double asignConyuge;
	private double antiguedad;
	
	public ReciboDeHabEmpPerm(String nombreEmp, String direccion, String fechaEmision, float sBruto, float sNeto,
			float obraSocial, float aportesJub, double asignPorHijo, double asignConyuge, double antiguedad) {
		super(nombreEmp, direccion, fechaEmision, sBruto, sNeto, obraSocial, aportesJub);
		this.asignPorHijo = asignPorHijo;
		this.asignConyuge = asignConyuge;
		this.antiguedad = antiguedad;
	}
	
	
	
	
}
