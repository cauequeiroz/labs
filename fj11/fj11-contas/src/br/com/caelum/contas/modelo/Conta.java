package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected String agencia;
	protected String titular;
	protected int numero;	
	protected double saldo;

	public String getAgencia() {
		return agencia;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo.");
		}
		
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException(valor);
		}
		
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo.");
		}
		
		this.saldo -= valor;
	}

	public abstract String getTipo();
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public String imprime() {
		return this.getTipo() + ": " + this.saldo;
	}
	
	@Override
	public String toString() {
		return "[titular: " + this.titular.toUpperCase() + "]";
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		
		if (!(object instanceof Conta)) {
			return false;
		}
		
		Conta outra = (Conta) object;
		return this.numero == outra.numero && this.agencia.equals(outra.agencia);
	}

}
