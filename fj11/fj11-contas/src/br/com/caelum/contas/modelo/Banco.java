package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	private int contaLivre = 0;
	private int limiteConta = 10;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[limiteConta];
	}
	
	public void adiciona(Conta conta) {
		if (contaLivre >= limiteConta) {
			this.limiteConta += 10;
			
			Conta[] old = this.contas;
			this.contas = new ContaCorrente[limiteConta];
			
			for (int i=0; i<old.length; i++) {
				this.contas[i] = old[i];
			}		
		}
		
		this.contas[contaLivre] = conta;
		contaLivre++;
	}
	
	public void mostraContas() {
		for (int i=0; i<contaLivre; i++) {
			System.out.println(this.contas[i]);
		}
	}
	
	public boolean contem(Conta conta) {
		for (int i=0; i<contaLivre; i++) {
			System.out.println("Buscando.." + i);
			if (this.contas[i].equals(conta)) {
				return true;
			}
		}
		
		return false;
	}
	
}