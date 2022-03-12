package com.lima.souza.caio.streams.distinct;

import java.util.Arrays;
import java.util.List;

import com.lima.souza.caio.streams.filter.Aluno;

public class Distinct {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a4 = new Aluno("Dani", 9.9);
		Aluno a2 = new Aluno("Beto", 4.7);
		Aluno a3 = new Aluno ("Caio", 9.8);
		Aluno a5 = new Aluno ("Edu", 9.8);
		Aluno a6 = new Aluno("Gui", 8.0);
		Aluno a7 = new Aluno("Fa", 3.4);
		Aluno a8 = new Aluno("Beto", 4.7);
		Aluno a9 = new Aluno ("Caio", 9.8);
		Aluno a10 = new Aluno("Dani", 9.9);
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);	
		
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nUsando skip e limit: ");
		alunos.stream()
		.distinct()
		.skip(2) //Pula os n primeiros indices
		.limit(2) //Limita em n registros o retorno
		.forEach(System.out::println);
		
		/*OBERVAÇÃO: takeWhile foi adicionado no JavaSE 9
		 * System.out.println("\nUsando takeWhile: ");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.getNota() >= 9)
		.forEach(System.out::println);*/
	}
}
