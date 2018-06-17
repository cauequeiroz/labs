class TestaLoop {
	public static void main(String[] args) {

		/*	While
		-------------------------------------- */
		int saldo = 500;

		while (saldo > 400) {
			System.out.println("Gastando R$ 20,00.");
			saldo = saldo - 20;
		}

		System.out.println("\nSaldo final: R$ " + saldo);

		int counter = 1;

		while (counter <= 10) {
			System.out.print(counter + " ");
			counter = counter + 1;
		}

		/*	Incremento
		-------------------------------------- */
		int x = 5;
		int y = x++;

		System.out.println("\n\nx: " + x + " - y: " + y + "\n");

		/*	For
		-------------------------------------- */
		for (int i = 10; i != 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n");

		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				continue;
			}

			System.out.print(i + " ");
		}

		System.out.println("\n\n");

		int counter2 = 0;
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");

			if (i % 2 == 0) {
				counter2++;
			}

			if (counter2 == 5) {
				System.out.println("\nAchei o 5º número par! (" + i + ").\n\n");
				break;
			}
		}

		int columns = 1;
		boolean grown = true;
		for (int i=0; i<=10; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print("#");
			}

			System.out.print("\n");

			if (grown && columns > 7) {
				grown = false;
			}

			if (grown) {
				columns++;
			} else {
				columns--;
			}
		}
	}
}