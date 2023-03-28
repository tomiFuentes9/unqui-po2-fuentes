package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;

public class EmpleadoPlantaPerm extends Empleado{
	private double cantHijos;
	private double antiguedad;
	
	public double calcularSalarioFamiliar() {
		return (cantHijos * 150) + this.calcularAntiguedad() + this.calcularSiCasado();
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
	
	
	public double aportesJubilatorios() {
		return(this.calcularBruto() * 0.15);
	}
	
	@Override
	public double calcularRetenciones() {
		return (this.calcBaseObraSocial()) + (cantHijos * 20) + (this.aportesJubilatorios());
	}
	
	
	@Override
	public double calcularNeto() {
		return this.calcularBruto() - this.calcularRetenciones();
	}
	
	public EmpleadoPlantaPerm(String nombre, String direccion, String estadoCivil, float fechaDeNacimiento,
			                  float sueldoBasico, float cantHijos, float antiguedad) {
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