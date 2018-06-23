package br.com.cauequeiroz;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientManager implements Runnable {
	private Socket client;
	
	public ClientManager(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		System.out.println("[System] Client connected: " + client.getInetAddress().getHostAddress());
		
		try {
			Scanner clientMessages = new Scanner(client.getInputStream());
			
			while (clientMessages.hasNextLine()) {
				System.out.println("[Client] " + clientMessages.nextLine());
			}
			
			clientMessages.close();	
		} catch(IOException error) {
			System.out.println("[Client] Error: " + error.getMessage());
		}
	}
}
