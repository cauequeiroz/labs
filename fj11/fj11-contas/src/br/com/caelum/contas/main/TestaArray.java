package br.com.caelum.contas.main;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class TestaArray {
	public static void main(String[] args) {
		
		Properties config = new Properties();
		config.setProperty("login", "cauequeiroz");
		config.setProperty("password", "1234");
		
		System.out.println(config.getProperty("loginn", "hey"));
	}
}
