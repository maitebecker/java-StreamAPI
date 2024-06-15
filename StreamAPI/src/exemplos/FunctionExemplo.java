package exemplos;

import java.util.*;
import java.util.function.Function;

/*
 * Representa uma função que recebe um argumento e produz um resultado
 * T : denota o tipo do argumento de entrada
 * R : denota o tipo de retorno da função
 * */

public class FunctionExemplo {
	  public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	    // Usar a Function com expressão lambda para dobrar todos os números
	    Function<Integer, Integer> dobrar = numero -> numero * 2;

	    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
	   
	    List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .toList();
	   
		/*
		 * numeros.stream() 
		 * .map(n -> n * 2) 
		 * .toList() 
		 * .forEach(System.out::println);
		 */
		  		
		/*
		 * numeros.stream() 
		 * .map(new Function<Integer,Integer>() { 
		 * 		public Integer apply(Integer n) { 
		 * 			return n*2; 
		 * 		} 
		 * }) 
		 * .toList() 
		 * .forEach(System.out::println);
		 */
		 
	    // Imprimir a lista de números dobrados
	     numerosDobrados.forEach(System.out::println);
	  }
}