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
		
		Collections.sort(nomes, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(nomes);
		
	}
}
