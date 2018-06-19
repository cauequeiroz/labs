package br.com.caelum.contas.modelo;

public class Funcionario {
	protected String nome;
	protected double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public String imprime() {
		return "Nome: " + this.nome + "\nSalario: R$ " + this.salario;
	}
}
