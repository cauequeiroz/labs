class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	void pinta(String cor) {
		this.cor = cor;
	}

	int quantasPortasEstaoAbertas() {
		int counter = 0;

		if (porta1.estaAberta()) counter++;
		if (porta2.estaAberta()) counter++;
		if (porta3.estaAberta()) counter++;

		return counter;
	}

	String imprime() {
		String dados = "\n=====================";
		dados += "\nCor: " + this.cor;
		dados += "\nQuantas portas estão abertas? " + this.quantasPortasEstaoAbertas();
		dados += "\n=====================\n";

		return dados;
	}
}

class Programa3 {
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.cor = "Marrom";

		System.out.println(casa.imprime());

		casa.pinta("Rosa");
		System.out.println(casa.imprime());

		casa.porta1.abre();
		casa.porta2.abre();
		System.out.println(casa.imprime());
	}
}