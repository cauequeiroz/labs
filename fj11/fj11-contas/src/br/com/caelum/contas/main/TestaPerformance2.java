package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance2 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		int total = 30000;
		
		
		
		for (int i=0; i<total; i++) {
			numbers.add(0, i);
		}
		
		long start = System.currentTimeMillis();
		
		for (int i=0; i<total; i++) {
			numbers.get(i);
		}		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (end - start) + "ms.");
		
		
	}
}
