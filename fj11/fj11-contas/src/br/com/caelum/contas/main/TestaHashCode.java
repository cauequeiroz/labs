package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashCode {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Caue Queiroz");
		cc.setAgencia("1234");
		cc.setNumero(1234);
		cc.deposita(250.0);
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setTitular("Caue Queiroz");
		cc2.setAgencia("1234");
		cc2.setNumero(1234);
		cc2.deposita(250.0);
		
		Set<Conta> contas = new HashSet<>();
		contas.add(cc);
		contas.add(cc2);
		
		System.out.println(contas);
		
		
	}
}
