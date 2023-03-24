package ar.edu.unq.po2.tp2;

public class CuentaBancaria {
	private String titular;
	private float saldo;
	private String cbu;

	public CuentaBancaria(String titular, float saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
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
