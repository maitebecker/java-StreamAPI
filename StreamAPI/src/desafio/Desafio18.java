package desafio;

import java.util.Arrays;
import java.util.List;

/*Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os 
 * números da lista são iguais e exiba o resultado no console.
 * */

public class Desafio18 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		int num = (int) numeros.stream().distinct().count();
		
		if(num >= 1) {
			System.out.println("Os elementos não são iguais");
		}else {
			System.out.println("Os elementos são iguais");
		}
	}
}
