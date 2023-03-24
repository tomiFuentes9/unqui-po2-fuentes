package ar.edu.unq.po2.tp2;

public class CuentaBancaria {
	private String titular;
	private float saldo;

	public CuentaBancaria(String titular, float saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
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
