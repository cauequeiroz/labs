package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;

public class TesteBanco {
	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		meuBanco.nome = "Itaú";

		System.out.println(meuBanco.nome);
	}
}
