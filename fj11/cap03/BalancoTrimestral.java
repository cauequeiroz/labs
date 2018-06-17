class BalancoTrimestral {
	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre / 3;

		System.out.println("\n===========================");
		System.out.println("Gastos do Trimestre: R$" + gastosTrimestre);
		System.out.println("Media mensal: R$" + mediaMensal);
		System.out.println("===========================\n");

		boolean temCaixa = true;

		if ( gastosTrimestre > 10000 && !temCaixa ) {
			System.out.println("Você está gastando demais!");
		} else {
			System.out.println("Está tudo bem.");
		}

	}
}