class Conta {
	int numero;
	double saldo;
	String titular;
	String agencia;
	Data dataDeAbertura = new Data();

	void saca(double valor) {
		this.saldo -= valor;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {
		String dados = "\n==========================";
		dados += "\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		dados += "\nSaldo: R$ " + this.saldo;
		dados += "\nRendimento: R$ " + this.calculaRendimento();
		dados += "\n==========================\n";

		return dados;
	}
}