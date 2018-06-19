package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario {
	private int numeroDeFuncionarios;
	
	public void setNumeroDeFuncionarios(int numero) {
		this.numeroDeFuncionarios = numero;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
	@Override
	public String imprime() {
		return "Nome: " + this.nome + "\nSalario: R$ " + this.salario + "\nFuncionarios: " + this.numeroDeFuncionarios;
	}
}
