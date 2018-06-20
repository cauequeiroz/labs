package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(500.0);
		System.out.println(cc.getValorImposto());
		
		Tributavel tributavel = cc;
		System.out.println(tributavel.getValorImposto());
		
		
	}
}
