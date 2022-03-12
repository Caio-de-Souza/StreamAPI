package com.lima.souza.caio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Beto", 4.7);
		Aluno a3 = new Aluno ("Caio", 9.8);
		Aluno a4 = new Aluno("Dani", 9.9);
		Aluno a5 = new Aluno ("Edu", 9.8);
		Aluno a6 = new Aluno("Gui", 8.0);
		Aluno a7 = new Aluno("Fa", 3.4);
		
		Predicate<Aluno> isAprovado = a -> a.nota > 7;
		Function<Aluno, String> msgmAprov = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!!!";
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Long ini = System.currentTimeMillis();
		alunos.stream()
			.filter(isAprovado)
			.map(msgmAprov)
			.forEach(System.out::println);
		Long fim = System.currentTimeMillis();
		Long tempo = fim - ini;
		System.out.println(TimeUnit.MILLISECONDS.toMillis(tempo) + " milisegundos.");
		
		
		System.out.println("\n\nUsando paralelal Stream: ");
		ini = System.currentTimeMillis();
		alunos.parallelStream()
		.filter(isAprovado)
		.map(msgmAprov)
		.forEach(System.out::println);
		fim = System.currentTimeMillis();
		tempo = fim - ini;
		System.out.println(TimeUnit.MILLISECONDS.toMillis(tempo) + " milisegundos.");
	}
}
