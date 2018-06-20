package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String message) {
		super(message);
	}
	
	public SaldoInsuficienteException(double valor) {
		super("Você tentou sacar R$ " + valor + ". Você não tem esse valor.");
	}
}
