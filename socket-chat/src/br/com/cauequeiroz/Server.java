package br.com.cauequeiroz;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(8080);
		System.out.println("[System] Server running at port 8080.");
		System.out.println("[System] Waiting for connections...");
		
		while(true) {
			Socket client = server.accept();	
			ClientManager clientManager = new ClientManager(client);
			
			new Thread(clientManager).start();		
		}
	}
}
