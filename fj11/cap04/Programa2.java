class Porta {
	boolean aberta;
	String cor;

	void abre() {
		this.aberta = true;
	}

	void fecha() {
		this.aberta = false;
	}

	void pinta(String cor) {
		this.cor = cor;
	}

	boolean estaAberta() {
		return this.aberta;
	}

	String imprime() {
		String dados = "\n=====================";
		dados += "\nCor: " + this.cor;
		dados += "\nEstá aberta? " + this.estaAberta();
		dados += "\n=====================\n";

		return dados;
	}
}

class Programa2 {
	public static void main(String[] args) {
		Porta p1 = new Porta();
		p1.cor = "Preta";

		System.out.println(p1.imprime());

		p1.abre();
		System.out.println(p1.imprime());

		p1.fecha();
		System.out.println(p1.imprime());

		p1.pinta("Rosa");
		System.out.println(p1.imprime());
	}
}