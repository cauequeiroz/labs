package br.com.cauequeiroz;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(12345);
		System.out.println("Server running at port 12345...");
		
		Socket client = server.accept();
		System.out.println("Client connected: " + client.getInetAddress().getHostAddress());
		
		Scanner clientInput = new Scanner(client.getInputStream());
		while(clientInput.hasNextLine()) {
			System.out.println(clientInput.nextLine());
		}
		
		clientInput.close();
		client.close();
		server.close();
		
	}
}
