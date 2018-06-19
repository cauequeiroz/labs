package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.contas.modelo.Gerente;

public class TestaFuncionarios {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Caue Queiroz");
		funcionario.setSalario(1000.0);
		
		System.out.println(funcionario.imprime());
		
		Gerente gerente = new Gerente();
		gerente.setNome("Henrique");
		gerente.setSalario(1000.0);
		gerente.setNumeroDeFuncionarios(5);
		
		System.out.println(gerente.imprime());

		
		System.out.println(funcionario.getBonificacao());
		System.out.println(gerente.getBonificacao());
	}
}
