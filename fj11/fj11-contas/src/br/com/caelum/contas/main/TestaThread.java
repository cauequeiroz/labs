package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Programa;

public class TestaThread {
	public static void main(String[] args) {
		
		Programa p1 = new Programa(1);
		Programa p2 = new Programa(2);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
	}
}
