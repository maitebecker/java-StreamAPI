package desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *  Encontrar o segundo número maior da lista:
 *  Com a ajuda da Stream API, encontre o segundo 
 *  número maior da lista e exiba o resultado no console.
 * */

public class Desafio7 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer maior = numeros.stream().sorted(Collections.reverseOrder()).toList().get(1);
		
		
		System.out.println("Segundo maior elemento: " + maior);
		
	}
}
