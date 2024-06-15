package exemplos;

import java.util.*;
import java.util.function.BinaryOperator;

/*Representa um operador binário que pega dois operandos e opera sobre 
 * eles para produzir um resultado. No entanto, o que o distingue de um 
 * BiFunciton normal é que seus argumentos e seu tipo de retorno são iguais
 * T : denota o tipo dos argumentos de entrada e o valor de retorno da operação
*/

public class BinaryOperatorExemplo {
	  public static void main(String[] args) {
	    // Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

	    // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
	    BinaryOperator<Integer> somar = Integer::sum;

	    // Usar o BinaryOperator para somar todos os números no Stream
	    int resultado = numeros.stream()
	        .reduce(0, somar);
	    
	    // Imprimir o resultado da soma
	    System.out.println("A soma dos números é: " + resultado);
	  }
	}
