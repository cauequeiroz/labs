class Pessoa {
	String nome;
	int idade;

	void fazAniversario() {
		this.idade++;
	}

	String imprime() {
		String dados = "\n=====================";
		dados += "\nNome: " + this.nome;
		dados += "\nIdade: " + this.idade;
		dados += "\n=====================\n";

		return dados;
	}
}

class Programa1 {
	public static void main(String[] args) {
		Pessoa caue = new Pessoa();
		caue.nome = "Caue Queiroz";
		caue.idade = 18;

		caue.fazAniversario();
		caue.fazAniversario();
		caue.fazAniversario();
		caue.fazAniversario();

		System.out.println(caue.imprime());
	}
}