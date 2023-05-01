package ar.edu.unq.po2.tp6;

public class Cliente implements Desarrollables{
	private String nombre;
	private String apellido;
	private String direccion;
	private double edad;
	private double sueldoNetoMensual;
	private double ahorros; //Para corroborar si recibio la tarasca
	private PropiedadInmobiliaria inmueble;
	private Banco banco;
	
	public Cliente(String nombre, String apellido, String direccion, double edad, double sueldoNetoMensual,
			double ahorros, PropiedadInmobiliaria inmueble, Banco banco) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.ahorros = ahorros;
		this.inmueble = inmueble;
		this.banco = banco;
	}

	public void recibirGuita(double monto) {
		ahorros += monto;
	}
	
	public void desarrollarSolicitudPers(double monto, double plazo, Cliente cl) {
		banco.desarrollarSolicitudPers(monto, plazo, cl);
	}

	public void desarrollarSolicitudHipo(double monto, double plazo, Cliente cl, PropiedadInmobiliaria jauz) {
		banco.desarrollarSolicitudHipo(monto, plazo, cl, jauz);
	}
	
	public double revisarSaldo() {
		return ahorros;
	}
	
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getEdad() {
		return edad;
	}

	public double calcularSueldoAnual() {
		return sueldoNetoMensual * 12;
	}
	
}
