package exemplos;

import java.util.*;
import java.util.function.Predicate;

/*
 *  Predicate é uma interface funcional que aceita um argumento e 
 *  retorna um valor booleano. Normalmente, costumava ser aplicado em 
 *  um filtro para uma coleção de objetos.
 * */

public class PredicateExemplo {
	  public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	    // Usar o Predicate com expressão lambda para filtrar números pares
	    Predicate<Integer> isPar = numero -> numero % 2 == 0;

	    // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
	    List<Integer> numerosPares = numeros.stream()
		.filter(isPar)
		.toList(); 
	    
		/*
		 * numeros.stream() 
		 * .filter(n -> n % 2 == 0) 
		 * .forEach(System.out::println);
		 */
	    
		/*
		 * numeros.stream() 
		 * .filter(new Predicate<Integer>() { 
		 * 		public boolean test(Integer n) { 
		 * 			return n % 2 == 0; 
		 * 		} 
		 * }) 
		 * .forEach(System.out::println);
		 */
		 
	    // Imprimir a lista de números pares
	    numerosPares.forEach(System.out::println);
	  }
}