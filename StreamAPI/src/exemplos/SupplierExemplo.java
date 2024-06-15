package exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 * A Interface Supplier representa uma função que não aceita 
 * nenhum argumento, mas produz um valor do tipo T
 * */

public class SupplierExemplo {
	public static void main(String[] args) {
	    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
	    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

	    // Usar o Supplier para obter uma lista com 5 saudações
		
		 List<String> listaSaudacoes = Stream.generate(saudacao) 
		 .limit(5) 
		 .toList();
		 
		/*
		 * Stream.generate(() -> "Olá, seja bem-vindo(a)!") 
		 * .limit(5) 
		 * .toList()
		 * .forEach(System.out::println);
		 */
	    
	    
	    // Imprimir as saudações geradas
	    //Utilizando o reference method:
	    listaSaudacoes.forEach(System.out::println);
	  }
}
