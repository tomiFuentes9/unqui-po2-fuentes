package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;


public class EmpleadoPlantaPerm extends Empleado{
	private double cantHijos;
	private double antiguedad;
	
	@Override
	public void generarRecibo(){
		Tango sistema = new TangoPerm();
		sistema.generarRecibo(this);//generar aca el recibo
	}
	
	public double calcularSalarioFamiliar() {
		return this.montoPorHijos() + this.calcularAntiguedad() + this.calcularSiCasado();
	}
	
	public double montoPorHijos() {
		return cantHijos * 150;
	}
	
	public float calcularSiCasado() {
		float res;
		if (this.getEstadoCivil() == "Casado") {
			res = 100;
		} else {
			res = 0;
		}
		return res;
	}
	
	public double calcularAntiguedad() {
		double res;
		if (antiguedad < 1) {
		    res = 50;
		}else {
			res = antiguedad * 50;
		}
		return res;
	}
	
	
	@Override
    public double calcularBruto() {
    	return this.getSueldoBasico() + this.calcularSalarioFamiliar();
    }
	
	@Override
	public double aportesJubilatorios() {
		return(this.calcularBruto() * 0.15);
	}
	
	@Override
	public double calcularRetenciones() {
		return (this.calcularObraSocial()) + (this.aportesJubilatorios());
	}
	
	@Override
	public double calcularObraSocial() {
		return super.calcularObraSocial() + cantHijos * 20;
	}
	
	@Override
	public double calcularNeto() {
		return this.calcularBruto() - this.calcularRetenciones();
	}
	

	public EmpleadoPlantaPerm(String nombre, String direccion, String estadoCivil, int fechaDeNacimiento,
			float sueldoBasico, double cantHijos, double antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	public double getCantHijos() {
		return cantHijos;
	}

	public double getAntiguedad() {
		return antiguedad;
	}

	
	
	
	
}