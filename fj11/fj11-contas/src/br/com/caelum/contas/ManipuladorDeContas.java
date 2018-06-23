package br.com.caelum.contas;

import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;
	
	public void criaConta(Evento evento) {
		
		String tipoDeConta = evento.getSelecionadoNoRadio("tipo");
		
		if (tipoDeConta.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		}
		else if (tipoDeConta.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));		
	}
	
	public void deposita(Evento evento) {
		this.conta.deposita(evento.getDouble("valorOperacao"));
	}
	
	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		double valor = evento.getDouble("valorTransferencia");
		
		this.conta.transfere(valor, destino);
	}
	
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
	}
}
