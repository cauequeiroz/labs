class Conta {
	int numero;
	Cliente titular = new Cliente();
	double saldo;

	boolean saca(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		}

		this.saldo -= quantidade;
		return true;
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transferePara(Conta destino, double quantidade) {
		if (!this.saca(quantidade)) {
			return false;
		}

		destino.deposita(quantidade);
		return true;
	}
}

class Cliente {
	String nome;
}

class Programa {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();

		minhaConta.titular.nome = "Caue Queiroz";
		minhaConta.saldo = 500.0;

		minhaConta.saca(50.0);
		minhaConta.deposita(3500.0);

		if (minhaConta.saca(3000.0)) {
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Você não tem saldo suficiente.");
		}

		System.out.println("Saldo: R$ " + minhaConta.saldo);

		Conta suaConta = new Conta();

		suaConta.titular.nome = "Henrique";
		suaConta.saldo = 300.0;

		if (minhaConta.transferePara(suaConta, 400.0)) {
			System.out.println("Transferencia realizada com sucesso.");
		} else {
			System.out.println("Transferencia não realizada.");
		}

		System.out.println("Caue: " + minhaConta.saldo);
		System.out.println("Henrique: " + suaConta.saldo);

	}
}