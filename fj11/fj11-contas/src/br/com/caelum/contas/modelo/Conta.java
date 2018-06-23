package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
