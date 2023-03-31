package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;
import ar.edu.unq.po2.tp2.*;


public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> empleados;
	
	public void liquidacionDeSueldos() {
		for (Empleado empleado : empleados) {
			this.generarReciboDeHaberes(empleado);
		}
	}
	
	public void generarReciboDeHaberes(Empleado emp) {
		/*if (emp.getSueldoBasico() > 200) {
			//como instanciar bien
		}*/
	}
	
	public float calcularMontoTotalBruto() {
		int res = 0;
		for(Empleado empleado: empleados) {
			res += empleado.calcularBruto();
		}
		return res;
	}
	
	public float calcularMontoTotalRetenciones() {
		int res = 0;
		for(Empleado empleado: empleados) {
			res += empleado.calcularRetenciones();
		}
		return res;
	}
	
	public float calcularMontoTotalNeto() {
		return this.calcularMontoTotalBruto() - this.calcularMontoTotalRetenciones();
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
