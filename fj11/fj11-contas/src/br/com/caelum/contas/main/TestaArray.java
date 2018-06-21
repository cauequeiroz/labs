package br.com.caelum.contas.main;

import java.util.Random;
import java.util.stream.DoubleStream;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArray {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for (int i=0; i<contas.length; i++) {
			contas[i] = new ContaCorrente();
			contas[i].setTitular("Conta número " + i);
			contas[i].deposita(fixDecimal(new Random().nextDouble() * 1000.0));		
		}
			
		double total = 0.0;
		
		for (Conta conta : contas) {
			total += conta.getSaldo();
		}
		
		System.out.println(fixDecimal(total));
		
	}
	
	static double fixDecimal(double number) {
		return Double.parseDouble(String.format("%.2f",	number));
	}
}
