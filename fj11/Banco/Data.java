class Data {
	int dia = 1;
	int mes = 1;
	int ano = 1900;

	void definir(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}