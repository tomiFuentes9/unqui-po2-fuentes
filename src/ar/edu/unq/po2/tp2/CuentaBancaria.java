package ar.edu.unq.po2.tp2;

public class CuentaBancaria {
	private String titular;
	private float saldo;
	private String cbu;
	private Boolean rojo;

	
	public CuentaBancaria(String titular, float saldo, String cbu, Boolean rojo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.cbu = cbu;
		this.rojo = rojo;
	}


	public void depositar(float dinero) {
		saldo += dinero;
	}
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
