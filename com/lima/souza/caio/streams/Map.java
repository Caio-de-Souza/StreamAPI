package com.lima.souza.caio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Fiat ", "Ford ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> String.valueOf(n.charAt(0));
		
		System.out.println("\n\nUsando composição: ");
		marcas.stream()
		.map(Utils.maiuscula)
		.map(primeiraLetra)
		.map(Utils::scream)
		.forEach(print);
	}
}
