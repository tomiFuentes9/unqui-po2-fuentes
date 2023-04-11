package ar.edu.unq.po2.tp2;
import java.util.*;
import ar.edu.unq.po2.tp2.*;


public class Empresa {
	private String nombre;
	private double cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;
	
	public void liquidacionDeSueldos() {
		for (Empleado empleado : empleados) {
			recibos.add(this.generarReciboDeHaberes(empleado));
		}
	}
	
	public ReciboDeHaberes generarReciboDeHaberes(Empleado emp) {
		return emp.generarRecibo();       
	}
	
	public double calcularMontoTotalBruto() {
		int res = 0;
		for(Empleado empleado: empleados) {
			res += empleado.calcularBruto();
		}
		return res;
	}
	
	public double calcularMontoTotalRetenciones() {
		int res = 0;
		for(Empleado empleado: empleados) {
			res += empleado.calcularRetenciones();
		}
		return res;
	}
	
	public double calcularMontoTotalNeto() {
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
	
	public double getCuit() {
		return cuit;
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	
	
}
