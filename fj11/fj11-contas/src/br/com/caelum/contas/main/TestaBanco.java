package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
	public static void main(String[] args) {
		
		Banco banco = new Banco("Itau", 341);
		
		for (int i=0; i<158; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Conta número " + i);
			conta.setAgencia("Agencia"+i);
			conta.setNumero(i);
			conta.deposita(500.0 + i);
			
			banco.adiciona(conta);
		}
		
		banco.mostraContas();
	}
}
