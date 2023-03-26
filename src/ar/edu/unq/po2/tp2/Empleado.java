package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;


public class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private float  fechaDeNacimiento; //año unicamente?
	private float  sueldoBasico;
	
	public float calcularEdad(float anoActual) {
		return anoActual - this.fechaDeNacimiento;
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
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public float getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(float fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
}


