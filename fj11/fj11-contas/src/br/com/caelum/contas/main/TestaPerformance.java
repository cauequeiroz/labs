package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		
		System.out.println("Teste de Performance");
		System.out.println("================================\n\n");
		
		System.out.println("Iniciando...");
		
		long startTime;
		long endTime;
		long addTime;
		long searchTime;
		
		Collection<Integer> numbers = new HashSet<>();
		int total = 300000;
		
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<total; i++) {
			numbers.add(i);
		}
		
		endTime = System.currentTimeMillis();
		addTime = endTime - startTime;
		
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<total; i++) {
			numbers.contains(i);
		}
		
		endTime = System.currentTimeMillis();
		searchTime = endTime - startTime;
		
		System.out.println("Add time: " + addTime + "ms.");
		System.out.println("Search time: " + searchTime + "ms.");
	}
}
