package ar.edu.unq.po2.tp2;
import java.util.*;
import ar.edu.unq.po2.tp2.*;


public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> empleados;
	
	
	public float calcularMontoTotalBruto() {
		return 0;
	}
	
	public float calcularMontoTotalRetenciones() {
		return 0;
	}
	
	public float calcularMontoTotalNeto() {
		return 0;
	}
	

	public Empresa(String nombre, int cuit, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	
	
}
