class TestaTipos {
	public static void main(String[] args) {

		// Inteiro
		int idade = 18;
		System.out.println("Idade: " + idade);

		// Real
		double altura = 1.69;
		System.out.println("Altura: " + altura + "cm");

		// Boolean
		boolean fuma = false;
		boolean menorDeIdade = idade < 18;

		System.out.println("Fuma? " + fuma);
		System.out.println("É menor de idade? " + menorDeIdade);

		// Char
		char nota = 'B';
		System.out.println("Nota: " + nota);

		// Casting
		double PI = 3.14;
		int valorDePI = (int) PI;

		System.out.println("Valor do PI: " + valorDePI);

	}
}