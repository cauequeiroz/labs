class Conta {
	private static int totalDeContas;

	private int id;
	private int numero;
	private double saldo;
	private String titular;
	private String agencia;
	private Data dataDeAbertura = new Data();

	Conta() {
		this.id = Conta.totalDeContas++;
	}

	Conta(String nome) {
		this();
		this.titular = nome;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getRendimento() {
		return this.saldo * 0.1;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public void setAgencia(String numero) {
		this.agencia = numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDataDeAbertura(int dia, int mes, int ano) {
		this.dataDeAbertura.definir(dia, mes, ano);
	}

	public String recuperaDadosParaImpressao() {
		String dados = "\n==========================";
		dados += "\nID: " + this.id;
		dados += "\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		dados += "\nSaldo: R$ " + this.saldo;
		dados += "\nRendimento: R$ " + this.getRendimento();
		dados += "\n==========================\n";

		return dados;
	}
}