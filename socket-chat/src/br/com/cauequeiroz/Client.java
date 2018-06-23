package br.com.cauequeiroz;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("127.0.0.1", 12345);
		System.out.println("Client has been connected.");
		
		Scanner keyboard = new Scanner(System.in);
		PrintStream clientOutput = new PrintStream(client.getOutputStream());
		
		while(keyboard.hasNextLine()) {
			clientOutput.println(keyboard.nextLine());
		}
		
		clientOutput.close();
		keyboard.close();
		client.close();
	}
}
