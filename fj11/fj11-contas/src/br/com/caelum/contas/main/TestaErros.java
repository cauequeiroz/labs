package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaErros {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(500.0);

		try {
			cc.saca(850.0);
		} catch (SaldoInsuficienteException error) {
			System.out.println(error.getMessage());
		}

		System.out.println(cc.getSaldo());

	}
}
