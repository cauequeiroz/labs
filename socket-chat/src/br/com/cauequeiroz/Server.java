package br.com.cauequeiroz;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(8080);
		System.out.println("[System] Server running at port 8080.");
		System.out.println("[System] Waiting for connections...");
		
		Socket client = server.accept();	
		System.out.println("[System] Client connected: " + client.getInetAddress().getHostAddress());
		
		Scanner clientMessages = new Scanner(client.getInputStream());
		
		while (clientMessages.hasNextLine()) {
			System.out.println("[Client] " + clientMessages.nextLine());
		}
		
		clientMessages.close();
		client.close();
		server.close();		
	}
}
