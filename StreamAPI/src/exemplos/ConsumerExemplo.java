package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * O consumer Interface representa uma função que recebe um 
 * argumento do tipo T e produz um resultado. No entanto, este 
 * tipo de funções não retorna nenhum valor.
 * */

public class ConsumerExemplo {
	public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	    // Usar o Consumer com expressão lambda para imprimir números pares
		  Consumer<Integer> imprimirNumeroPar = numero -> { 
			  if (numero % 2 == 0) {
				  System.out.println(numero); 
				  } 
		  };
  
		/*
		 * numeros.stream()
		 * .forEach(new Consumer<Integer>() { 
		 * 		public void accept(Integer n) { 
		 * 			if(n % 2 == 0) { 
		 * 				System.out.println(n); 
		 * 			} 
		 * 		} 
		 * });
		 */  
		
		/*
		 * numeros.forEach(n -> { 
		 * 		if(n % 2 == 0) { 
		 * 			System.out.println(n); 
		 * 		} 
		 * });
		 */
		  
		  //Outra maneira utilizando o filter do Predicate:
		  numeros.stream()
		  .filter(n -> n % 2 == 0)
		  .forEach(System.out::println);
	   
	    // Usar o Consumer para imprimir números pares no Stream
	    numeros.stream().forEach(imprimirNumeroPar);
	  }
}
