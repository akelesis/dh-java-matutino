package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

//import java.util.HashSet;
//import java.util.Set;

public class Programa {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		pilha.push("Harry Potter e a C�mara Secreta");
		pilha.push("A Guerra dos Tronos - A F�ria dos Reis");
		
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
//		Queue<String> fila = new LinkedList<>();
//		
//		fila.add("Jo�o");
//		fila.add("Maria");
//		
//		System.out.println(fila.poll());
//		System.out.println(fila.peek());
//		System.out.println(fila.poll());
//		System.out.println(fila.poll());
		
		
		
//		List<String> produtos = new ArrayList<>();
//		Map<String, String> materiais = new HashMap<>();
//		List<String> lista1 = new ArrayList<>();
//		lista1.add("Ma��");
//		lista1.add("Fu�");
//		lista1.add("Banana");
//		
//		materiais.put("Junior", "Colher de pau");
//		materiais.put("Seu Geraldo", "Fu�");
//		materiais.put("Dona Rute", "Leite");
//		
//		for(String chave : materiais.keySet()) {
//			System.out.println(chave + " - " +materiais.get(chave));
//		}
		
//		produtos.add(new Produto("ovos", 9.99));
//		produtos.add(new Produto("a�ucar", 2.99));
//		produtos.add(new Produto("manteiga", 8.50));
		
//		Set geral = new HashSet();
//		
//		geral.add(1);
//		geral.add(2.5);
//		geral.add("Teste");
//		geral.add(new Produto("Arroz", 5.00));
//		
//		for(Object obj : geral) {
//			System.out.println(obj);
//		}
		
//		produtos.add("ovos");
//		produtos.add("a�ucar");
//		produtos.add("manteiga");
//		produtos.add("fermento");
//		produtos.add("fermento");
//		produtos.add("cacau em p�");
//		produtos.add("leite condensado");
//		produtos.add("creme de leite");
//		produtos.add("abacaxi");
		
//		for(String produto : produtos) {
//			System.out.println(produto);
//		}
	}
}
