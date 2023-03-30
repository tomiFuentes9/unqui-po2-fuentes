package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.Date;


public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private double  fechaDeNacimiento; //Es el año unicamente
	private float  sueldoBasico;
	
	public double calcularEdad(double añoActual) {
		return añoActual - this.fechaDeNacimiento; 
	}
	
	public abstract double calcularBruto();
	
	public abstract double calcularRetenciones();
	
	public abstract double calcularNeto();
	
	
	public double calcBaseObraSocial() {
		return (this.calcularBruto() * 0.10);
	}
	
	public Empleado(String nombre, String direccion, String estadoCivil, int fechaDeNacimiento, float sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	
}


