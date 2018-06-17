class Ex4 {
	public static void main(String[] args) {

		int fatorial = 1;
		int qtde = 20;

		for (int n = 1; n <= qtde; n++) {
			int result = fatorial;

			for (int i = (result-1); i >= 1; i--) {
				result *= i;
			}

			System.out.println(fatorial + "! é " + result);
			fatorial++;
		}

	}
}