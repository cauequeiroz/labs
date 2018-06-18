public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50.0);

		System.out.println(conta.getSaldo());

	}
}
