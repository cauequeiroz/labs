class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();

		c1.titular = "Caue Queiroz";
		c1.numero = 1234;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura.definir(7, 6, 1995);

		c1.deposita(250.0);

		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2 = new Conta();

		c2.titular = "Caue Queiroz";
		c2.numero = 1234;
		c2.agencia = "45678-9";
		c2.saldo = 50.0;
		c2.dataDeAbertura.definir(16, 4, 2018);

		c2.deposita(250.0);

		System.out.println(c2.recuperaDadosParaImpressao());

	}
}