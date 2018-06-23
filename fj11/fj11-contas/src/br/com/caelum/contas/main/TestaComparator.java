package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaComparator {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Caue Queiroz");
		nomes.add("Amanda");
		nomes.add("Zorro");
		
		Collections.sort(nomes, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}			
		});
		
		System.out.println(nomes);
		
	}
}
