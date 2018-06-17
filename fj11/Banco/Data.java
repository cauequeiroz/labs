class Data {
	private int dia = 1;
	private int mes = 1;
	private int ano = 1900;

	public void definir(int dia, int mes, int ano) {
		if (!Data.isDataValida(dia, mes, ano)) {
			System.out.println("Escolha uma data válida.");
			return;
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	private static boolean isDataValida(int dia, int mes, int ano) {
		if (dia <= 0 || mes <= 0 || ano <= 0) {
			return false;
		}

		if (dia > 31 || mes > 12) {
			return false;
		}

		int totalDeDiasNoMes = 0;
		
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				totalDeDiasNoMes = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				totalDeDiasNoMes = 30;
				break;
			case 2:
				totalDeDiasNoMes = 29;
				break;
		}

		if (dia > totalDeDiasNoMes) {
			return false;
		}

		return true;
	}
}