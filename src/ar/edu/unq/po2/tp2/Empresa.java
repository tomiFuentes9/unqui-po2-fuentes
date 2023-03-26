package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;


public class Empresa {
	private String nombre;
	private int cuit;
	private Empleado[] empleados;
	
	public Empresa(String nombre, int cuit, Empleado[] empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public Empleado[] getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	
	
}
