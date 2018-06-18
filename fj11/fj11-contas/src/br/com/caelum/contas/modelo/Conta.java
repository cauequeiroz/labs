package br.com.caelum.contas.modelo;

public class Conta {
	private String agencia;
	private String titular;
	private int numero;	
	private double saldo;

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

}
