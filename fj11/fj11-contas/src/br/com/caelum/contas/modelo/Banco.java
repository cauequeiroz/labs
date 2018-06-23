package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
	private int numero;
	private List<Conta> contas;
	private Map<String, Conta> clientes;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<Conta>();
		this.clientes = new HashMap<String, Conta>();
	}
	
	public void adiciona(Conta conta) {
		this.contas.add(conta);
		this.clientes.put(conta.getTitular(), conta);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}
	
	public void mostraContas() {
		for (Conta conta : this.contas ) {
			System.out.println(conta);
		}
	}
	
	public boolean contem(Conta conta) {
		return this.contas.contains(conta);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorTitular(String titular) {
		return this.clientes.get(titular);
	}
}