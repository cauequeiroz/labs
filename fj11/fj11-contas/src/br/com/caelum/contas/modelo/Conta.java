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
		this.saldo += valor;
	}
	
	public void saca(double valor) {
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

}
