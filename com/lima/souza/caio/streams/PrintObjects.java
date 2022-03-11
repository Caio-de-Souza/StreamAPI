package com.lima.souza.caio.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Beto");
		
		System.out.println("Usando foreach:");
		for(String aprovado: aprovados) {
			System.out.println(aprovado);
		}
		
		System.out.println("\nUsando Iterator:");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream:");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
	}
}
