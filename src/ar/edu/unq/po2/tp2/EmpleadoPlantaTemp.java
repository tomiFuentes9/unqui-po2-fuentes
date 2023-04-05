package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;


public class EmpleadoPlantaTemp extends Empleado{
	private String finDesignaciónPlantaTemp;
	private float cantHorasExtra;
	
	
	@Override
	public void generarRecibo(){
		Tango sistema = new TangoTemp();
		sistema.generarRecibo(this);//generar aca el recibo
	}
	
	
	@Override
    public double calcularBruto() {
    	return this.getSueldoBasico() + (cantHorasExtra * 40);
    }
	
	
	public double aportesJubilatorios() {
		return(this.calcularBruto() * 0.10) + (cantHorasExtra * 5);
	}
	
	public double cincuentaOMas() {
		double res;
		if (this.calcularEdad(2023) >= 50) {
			res = 25;
		}else {
			res = 0;
		}
		return res;
	}
	
	
	@Override
	public double calcularRetenciones() {
		return (this.calcularObraSocial()) + this.cincuentaOMas() + (this.aportesJubilatorios());
	}
	
	public double calcularObraSocial() {
		return super.baseObraSocial() + this.cincuentaOMas();
	}
	
	@Override
	public double calcularNeto() {
		return this.calcularBruto() - this.calcularRetenciones();
	}
	
	
	public EmpleadoPlantaTemp(String nombre, String direccion, String estadoCivil, int fechaDeNacimiento,
			float sueldoBasico, String finDesignaciónPlantaTemp, float cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.finDesignaciónPlantaTemp = finDesignaciónPlantaTemp;
		this.cantHorasExtra = cantHorasExtra;
	}


	public String getFinDesignaciónPlantaTemp() {
		return finDesignaciónPlantaTemp;
	}

	public float getCantHorasExtra() {
		return cantHorasExtra;
	}
	
	
	
}
