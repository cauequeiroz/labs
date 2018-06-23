package br.com.caelum.contas.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestaEntrada {
	public static void main(String[] args) throws IOException {
		
		/*	Read from file
		----------------------------------------------------------------------- */
		
//		InputStream input = new FileInputStream("src/arquivo.txt");
//		InputStreamReader inputReader = new InputStreamReader(input);
//		BufferedReader finalInputReader = new BufferedReader(inputReader);
//		
//		String line = finalInputReader.readLine();
//		
//		while(line != null) {
//			System.out.println(line);
//			line = finalInputReader.readLine();
//		}
//		
//		finalInputReader.close();
		
		
		/*	Read from keyboard
		----------------------------------------------------------------------- */
		
		InputStream input = System.in;
		InputStreamReader inputReader = new InputStreamReader(input);
		BufferedReader finalInputReader = new BufferedReader(inputReader);
		
		String line = finalInputReader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = finalInputReader.readLine();
		}
		
		finalInputReader.close();
		
		
		
	}
}
