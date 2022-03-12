package com.lima.souza.caio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		/*
		 * 1. Número para string biária (6=> "110")
		 * 2. Inverter a string ("110" => "011")
		 * 3. Converter de volta para inteiro => "011" => 3 
		 */
		Function<String, Integer> binToNum = bin -> Integer.valueOf(bin, 2);
		UnaryOperator<String> invert = s -> new StringBuilder(s).reverse().toString();
		
		System.out.println("Início: ");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		nums.forEach(System.out::println);
		
		System.out.println("\n\nProcessando...");
		System.out.println("\n\nOutput:");
		nums.stream()
			.map(Integer::toBinaryString)
			.map(invert)
			.map(binToNum)
			.forEach(System.out::println);
	}

}
