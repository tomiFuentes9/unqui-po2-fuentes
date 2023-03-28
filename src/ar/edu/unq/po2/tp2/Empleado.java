package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;


public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private float  fechaDeNacimiento; //año unicamente?
	private float  sueldoBasico;
	
	public float calcularEdad() {
		return 0 - this.fechaDeNacimiento; //ver como conseguir la fecha actual y en base a eso ver como calcular la edad
	}
	
	public abstract double calcularBruto();
	
	public abstract double calcularRetenciones();
	
	public abstract double calcularNeto();
	
	
	public double calcBaseObraSocial() {
		return (this.calcularBruto() * 0.10);
	}
	
	public Empleado(String nombre, String direccion, String estadoCivil, float fechaDeNacimiento, float sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
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
	
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
}


