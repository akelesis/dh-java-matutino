package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		Consumer<String> println = System.out::println;
		Consumer<Double> print = System.out::print;
//		
//		Stream<String> nomes = Stream.of("Rafael", "Paulo", "Matheus", "Jonathan");
//		
//		List<String> outrosNomes = Arrays.asList("Ana", "Matheus", "Ricardo", "Maik");
//		
//		UnaryOperator<String> addGreeting = nome -> "Olá, " + nome;
//		
//		outrosNomes.stream().forEach(println);;
//		
//		nomes.map(addGreeting)
//		.forEach(println);
		
		Predicate<Produto> barato = prod -> prod.getPreco() <= 2000;
		Predicate<Produto> caro = prod -> prod.getPreco() > 2000;
		
		Produto p1 = new Produto("Celular", 1500);
		Produto p2 = new Produto("Computador", 2500);
		Produto p3 = new Produto("Tablet", 1200);
		Produto p4 = new Produto("Notebook", 3800);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.parallelStream()
				.filter(barato)
				.map(prod -> prod.getPreco())
				.reduce((total, atual) -> total + atual)
				.ifPresent(print);
		System.out.println("\n");
		produtos.parallelStream()
			.filter(caro)
			.map(prod -> prod.getPreco())
			.reduce((total, atual) -> total + atual)
			.ifPresent(print);
		
		
//		Stream<String> nomeProdutos = produtos.stream()
//			.filter(barato)
//			.map(prod -> prod.getNome());
//			
//		nomeProdutos.forEach(nome -> System.out.print(" " + nome));
		
		// Criar um reduce para baratos <= 2000
		// Criar um reduce para caros > 2000
		
	}
}
