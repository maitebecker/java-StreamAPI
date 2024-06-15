package desafio;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Verificar se todos os números da lista são distintos (não se repetem):
 * Com a Stream API, verifique se todos os números da lista são distintos 
 * (não se repetem) e exiba o resultado no console.
 * */

public class Desafio9 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Set<Integer> repetidos = numeros.stream()
			.filter(n -> Collections.frequency(numeros, n) > 1)
			.collect(Collectors.toSet());
		
		System.out.println("Números repetidos: " + repetidos);
	}
}
