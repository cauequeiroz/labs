package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ControleDeBonificacoes;
import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Henrique");
		gerente.setSalario(1000.0);
		gerente.setNumeroDeFuncionarios(5);
		
		System.out.println(gerente.imprime());

		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		controle.registra(gerente);
		
		System.out.println(controle.getTotalDeBonificacoes());
	}
}
