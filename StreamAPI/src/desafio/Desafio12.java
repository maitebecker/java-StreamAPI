package desafio;

import java.util.Arrays;
import java.util.List;

/*
 * Encontre o produto de todos os números da lista:
 * Com a ajuda da Stream API, encontre o produto de 
 * todos os números da lista e exiba o resultado no console.
 * */

public class Desafio12 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream().map(n -> n * n).toList().forEach(System.out::println);
	}
}
