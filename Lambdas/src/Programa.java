import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Programa {
	public static void main(String[] args) {
		BinaryOperator<Integer> soma = (x, y) -> {return x + y;};
		BinaryOperator<Integer> multiplicacao = (x, y) -> {return x * y;};
		
		Consumer<String> print = System.out::println;
		
		Consumer<String> printWithGreeting = word -> System.out.println("Olá, boa tarde! Eu sou " + word);
		
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Rafael");
		nomes.add("Diogo");
		nomes.add("Marcos Segundo");
		nomes.add("Estevao");
		nomes.add("Jackeline");
		
		nomes.forEach(printWithGreeting);
		
		
		System.out.println(soma.apply(2, 3));
		System.out.println(multiplicacao.apply(2, 3));
	}
}
