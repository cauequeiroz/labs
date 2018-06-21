package br.com.caelum.contas.main;

public class TestaString {
	public static void main(String[] args) {
		
		// Como fazer para saber se uma String se encontra dentro de outra?
		String nome = "Caue Queiroz";
		System.out.println(nome.contains("Quei"));
		
		//E para tirar os espaços em branco das pontas de uma String?
		String spaced = "   Oi    ";
		System.out.println(spaced.trim());
		
		//E para saber se uma String está vazia?
		String empty = "";
		System.out.println(empty.isEmpty());
		
		// E para saber quantos caracteres tem uma String?
		System.out.println(nome.length());
		
		// Escreva um método que usa os métodos charAt e length de uma String para imprimir a mesma caractere a caractere, com cada caractere em uma linha diferente.
		letraPorLinha(nome);
		
		// Reescreva o método do exercício anterior, mas modificando ele para que imprima a String de trás para a frente e em uma linha só. 
		reverter("Socorram-me, subi no ônibus em Marrocos");	
		reverter("anotaram a data da maratona");
		reverterMaster("Caue Queiroz");
		
	}
	
	public static void letraPorLinha(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void reverter(String str) {
		for (int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i - 1));
		}
		
		System.out.println();
	}
	
	public static void reverterMaster(String str) {
		StringBuilder string = new StringBuilder(str);
		string.reverse();
		
		System.out.println(string);
	}
}
