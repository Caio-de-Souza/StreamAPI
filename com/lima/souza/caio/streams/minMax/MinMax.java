package com.lima.souza.caio.streams.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.lima.souza.caio.streams.filter.Aluno;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Beto", 4.7);
		Aluno a3 = new Aluno ("Caio", 9.8);
		Aluno a4 = new Aluno("Dani", 9.9);
		Aluno a5 = new Aluno ("Edu", 9.8);
		Aluno a6 = new Aluno("Gui", 8.0);
		Aluno a7 = new Aluno("Fa", 3.4);	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);		
		Comparator<Aluno> melhorNota = (al1, al2) -> Double.compare(al1.getNota(), al2.getNota());
		alunos.stream().max(melhorNota).ifPresent(System.out::println);
		alunos.stream().min(melhorNota).ifPresent(System.out::println);
	}
}
