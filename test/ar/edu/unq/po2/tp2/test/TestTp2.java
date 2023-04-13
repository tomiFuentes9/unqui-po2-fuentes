package ar.edu.unq.po2.tp2.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp2.*;

// assertTrue, assertEquals.

public class TestTp2 {
	
	EmpleadoPlantaPerm empleadoP = new EmpleadoPlantaPerm("Tomas", "Segurola 345", "Soltero", 2001,
			50000, 0, 2);
	EmpleadoPlantaTemp   empleadoT = new EmpleadoPlantaTemp("Javier", "Segurola 543", "Casado", 1985,
			32000, "21/04/2023", 5);
	
	
	@Test
	public void calcularSueldoBrutoTest() {
		
		double sueldobrutoP = empleadoP.calcularBruto();
		double sueldoEsperadoP = 50000;
		
		double sueldobrutoT = empleadoT.calcularBruto();
		double sueldoEsperadoT = 32000;
		
		assertEquals(sueldobrutoP,sueldoEsperadoP);
		assertEquals(sueldobrutoT,sueldoEsperadoT);
	}
	
	
	@Test
	public void calcularRetencionesTest() {
		
		double retencionesP = empleadoP.calcularRetenciones();
		double retencionesEsperadaP = 12512.5;
		
		double retencionesT = empleadoT.calcularRetenciones();
		double retencionesEsperadaT = 10130;
		
		assertEquals(retencionesP,retencionesEsperadaP);
		assertEquals(retencionesT,retencionesEsperadaT);
		
	}
	
	@Test
	public void calcularSueldoNeto() {
		
		double netoP = empleadoP.calcularNeto();
		double netoEsperadaP = 37537.5;
		
		double netoT = empleadoT.calcularNeto();
		double netoEsperadaT = 40270;
		
		assertEquals(netoP,netoEsperadaP);
		assertEquals(netoT,netoEsperadaT);
	}
		
}