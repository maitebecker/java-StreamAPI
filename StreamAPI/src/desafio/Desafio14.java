package desafio;

import java.util.Arrays;
import java.util.List;

/*
 *  Encontre o maior número primo da lista:
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 * */

public class Desafio14 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int maior = numeros.stream().filter(n-> isPrime(n)).max(Integer::compare).get();
		
		System.out.println("Maior número primo: " + maior);
	}
	
	public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
