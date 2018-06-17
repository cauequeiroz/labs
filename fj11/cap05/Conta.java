class Conta {
	private double saldo;
	private int numero;
	private String titular;

	private static int totalDeContas = 0;

	Conta() {
		System.out.println("Criando uma conta.");
		this.saldo = 0.0;

		Conta.totalDeContas++;
	}

	Conta(String nome) {
		this();

		System.out.println("[nome] Criando uma conta.");
		this.titular = nome;
	}

	Conta(int numero, String nome) {
		this(nome);

		System.out.println("[numero e nome] Criando uma conta.");
		this.numero = numero;
	}

	public void saca(double quantidade) {
		if (this.saldo < quantidade) {
			System.out.println("Saque não realizado.");
			return;
		}

		this.saldo -= quantidade;
	}

	public void deposita(double quantidade) {
		if (quantidade < 0) {
			System.out.println("Deposito não realizado.");
			return;
		}

		this.saldo += quantidade;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}

class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("Caue Queiroz");
		Conta c2 = new Conta();
		Conta c3 = new Conta();

		System.out.println(Conta.getTotalDeContas());
	}
}