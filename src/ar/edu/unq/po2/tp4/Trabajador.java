package ar.edu.unq.po2.tp4;
import java.util.*;

public class Trabajador {
	private List<Ingreso> ingresosPercibidos;

	public Trabajador() {
		super();
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	
	public void agregarIngreso(Ingreso ing) {
		ingresosPercibidos.add(ing);
	}
	
	public double getTotalPercibido() {
		double res = 0;
		for(Ingreso ingreso : ingresosPercibidos) {
			res += ingreso.getMonto();
		}
		return res;
	}
	
	public double getTotalMontoImponible() {
		double res = 0;
		for(Ingreso ingreso : ingresosPercibidos) {
			res += ingreso.montoImponible();
		}
		return res;
	}
	
	public double getImpuestoAPagar() {
		return this.getTotalMontoImponible() * 0.02;
	}
}
