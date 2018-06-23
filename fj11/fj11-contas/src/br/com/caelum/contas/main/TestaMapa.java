package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		c1.deposita(500.0);
		c2.deposita(2300.0);
		
		Map<String, Conta> staff = new HashMap<>();
		staff.put("director", c1);
		staff.put("CEO", c2);
		
		
		Conta diretor = staff.get("CEO");
		System.out.println(diretor.getSaldo());
		
	}
}
