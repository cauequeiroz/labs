package br.com.caelum.contas.modelo;

public class Programa implements Runnable {
	private int id;
	
	public Programa(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10000; i++) {
			System.out.println("[Programa " + this.id + "] Imprimindo número " + i);
		}
	}
}
