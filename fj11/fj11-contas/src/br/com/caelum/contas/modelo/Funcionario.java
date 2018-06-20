package br.com.caelum.contas.modelo;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();
	
	public String imprime() {
		return "Nome: " + this.nome + "\nSalario: R$ " + this.salario;
	}
}
