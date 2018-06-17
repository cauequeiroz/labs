class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("Caue Queiroz");

		c1.setNumero(1234);
		c1.setAgencia("45678-9");
		c1.setDataDeAbertura(30, 11, 1995);
		c1.deposita(250.0);

		System.out.println(c1.recuperaDadosParaImpressao());
	}
}