package com.lima.souza.caio.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		BinaryOperator<Integer> soma = (ac, n) -> ac+ n;
		
		int result1 = nums.stream().reduce(soma).get();
		System.out.println(result1);
		
		//No parallel o valor inicial é replicado pra cada termo
		int result2 = nums.parallelStream().reduce(100, soma);
		System.out.println(result2);
		
		int result3= nums.stream().reduce(100, soma);
		System.out.println(result3);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
