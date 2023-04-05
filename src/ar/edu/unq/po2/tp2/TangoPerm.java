package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;

public class TangoPerm extends Tango{

	@Override
	public ReciboDeHaberes generarRecibo(Empleado emp) {
		return new ReciboDeHabEmpPerm(emp.getNombre(), emp.getDireccion(), 2023, emp.calcularBruto(), emp.calcularNeto(), emp.calcularObraSocial(), emp.aportesJubilatorios());//, emp.montoPorHijos(), emp.montoPorConyuge()); Hacer getters para los datos
	}
	
}
