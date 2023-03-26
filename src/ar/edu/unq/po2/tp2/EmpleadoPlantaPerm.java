package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;

public class EmpleadoPlantaPerm extends Empleado{
	private float cantHijos;
	private float antiguedad;
	
	
	public EmpleadoPlantaPerm(String nombre, String direccion, String estadoCivil, float fechaDeNacimiento,
			                  float sueldoBasico, float cantHijos, float antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}


	public float getCantHijos() {
		return cantHijos;
	}


	public void setCantHijos(float cantHijos) {
		this.cantHijos = cantHijos;
	}


	public float getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(float antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
	
}