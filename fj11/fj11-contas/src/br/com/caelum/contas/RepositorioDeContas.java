package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class RepositorioDeContas {
	public void salva(List<Conta> contas) {
		try {
			PrintStream stream = new PrintStream("contas.txt");
			String line;
			
			for (Conta conta : contas) {
				line = conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + "," + conta.getTitular() + "," + conta.getSaldo();
				stream.println(line);
			}
			
			stream.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}
	}

	public List<Conta> carrega() {
		List<Conta> contas = new ArrayList<>();
		
		try {
			Scanner database = new Scanner(new FileReader("contas.txt"));
		
			while(database.hasNextLine()) {
				String line = database.nextLine();
				String[] values = line.split(",");
				Conta conta;
				
				if (values[0].equals("Conta Corrente")) {
					conta = new ContaCorrente();
				} else {
					conta = new ContaPoupanca();
				}
				
				conta.setNumero(Integer.parseInt(values[1]));
				conta.setAgencia(values[2]);
				conta.setTitular(values[3]);
				conta.deposita(Double.parseDouble(values[4]));
				
				contas.add(conta);				
			}	
			
			database.close();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}			
		
		return contas;		
	}
}
