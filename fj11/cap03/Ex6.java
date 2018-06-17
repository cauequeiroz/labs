class Ex6 {
	public static void main(String[] args) {

		int x = 0;
		int y = 1;

		System.out.print(x + " " + y + " ");

		while (y <= 100) {
			int aux = x;
			
			x = y;
			y = y + aux;

			System.out.print(y + " ");	
		}
	}
}