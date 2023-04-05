package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;

public abstract class ReciboDeHaberes {
	
	private String nombreEmp;
	private String direccion;
	private int fechaEmision;
	private double sBruto;
	private double sNeto;
	private double obraSocial;
	private double aportesJub;
	
	public ReciboDeHaberes(String nombreEmp, String direccion, int fechaEmision, double sBruto, double sNeto,
			double obraSocial, double aportesJub) {
		super();
		this.nombreEmp = nombreEmp;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sBruto = sBruto;
		this.sNeto = sNeto;
		this.obraSocial = obraSocial;
		this.aportesJub = aportesJub;
	}
	
	
	//Hacer metodo para mostrar recibo de haberes para revisar que se pasen bien los datos
}
