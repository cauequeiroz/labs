package br.com.cauequeiroz;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("127.0.0.1", 8080);
		PrintStream clientOutput = new PrintStream(client.getOutputStream()); 
		System.out.println("[System] Client has been connected.");
		
		Scanner keyboard = new Scanner(System.in);
		
		while(keyboard.hasNextLine()) {
			String message = keyboard.nextLine();
			clientOutput.println(message);
		}
		
		keyboard.close();
		clientOutput.close();
		client.close();
	}
}
