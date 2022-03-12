package com.lima.souza.caio.streams.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.lima.souza.caio.streams.filter.Aluno;

public class Match {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Beto", 4.7);
		Aluno a3 = new Aluno ("Caio", 9.8);
		Aluno a4 = new Aluno("Dani", 9.9);
		Aluno a5 = new Aluno ("Edu", 9.8);
		Aluno a6 = new Aluno("Gui", 8.0);
		Aluno a7 = new Aluno("Fa", 3.4);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Aluno> isAprovado = a -> a.getNota() >= 7;
		Predicate<Aluno> isReprovado = isAprovado.negate();

		System.out.println(alunos.stream().allMatch(isAprovado));
		System.out.println(alunos.stream().anyMatch(isAprovado));
		System.out.println(alunos.stream().noneMatch(isReprovado));
	}
}
