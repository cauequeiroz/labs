class Ex8 {
	public static void main(String[] args) {

		int counter = 10;

		for (int line=1; line<=counter; line++) {

			for (int column=1; column<=line; column++) {
				System.out.print(line * column + " ");
			}

			System.out.print("\n");
		}


	}
}