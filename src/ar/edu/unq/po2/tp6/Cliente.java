package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private double edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, double edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public void solicitudCreditoPersonal() {
		
	}
	
	public void solicitudCreditoHipotecario() {
		
	}
	
	public double calcularSueldoAnual() {
		return sueldoNetoMensual * 12;
	}
	
}
