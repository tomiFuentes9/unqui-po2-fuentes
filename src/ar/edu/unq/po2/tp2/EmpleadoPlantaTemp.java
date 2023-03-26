package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;

public class EmpleadoPlantaTemp extends Empleado{
	private String finDesignaciónPlantaTemp;
	private float cantHorasExtra;
	
	
	public EmpleadoPlantaTemp(String nombre, String direccion, String estadoCivil, float fechaDeNacimiento,
			float sueldoBasico, String finDesignaciónPlantaTemp, float cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.finDesignaciónPlantaTemp = finDesignaciónPlantaTemp;
		this.cantHorasExtra = cantHorasExtra;
	}


	public String getFinDesignaciónPlantaTemp() {
		return finDesignaciónPlantaTemp;
	}


	public void setFinDesignaciónPlantaTemp(String finDesignaciónPlantaTemp) {
		this.finDesignaciónPlantaTemp = finDesignaciónPlantaTemp;
	}


	public float getCantHorasExtra() {
		return cantHorasExtra;
	}


	public void setCantHorasExtra(float cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}
	
	
	
	
	
}
