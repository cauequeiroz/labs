class Ex8 {
	public static void main(String[] args) {

		int max = 3;

		for (int line = 1; line <= max; line++) {
			for (int column = 1; column <= line; column++) {
				System.out.print(line * column + " ");
			}

			System.out.println("");
		}
	}
}