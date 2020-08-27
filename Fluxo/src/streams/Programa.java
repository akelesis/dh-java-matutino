package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Lucas", 28);
		Cliente c2 = new Cliente("Estevão", 32);
		Cliente c3 = new Cliente("Wesley", 54);
		Cliente c4 = new Cliente("Poliana", 65);
		
		List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4);
		
		Produto p1 = new Produto("Celular", 1500);
		Produto p2 = new Produto("Computador", 2500);
		Produto p3 = new Produto("Tablet", 1200);
		Produto p4 = new Produto("Notebook", 3800);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		List<Compra> compras = new ArrayList<>();
		
		compras.add(new Compra(p1, c3));
		compras.add(new Compra(p2, c2));
		compras.add(new Compra(p3, c4));
		compras.add(new Compra(p4, c1));
		compras.add(new Compra(p2, c3));
		
//		produtos.stream()
//			.filter(prod -> prod.getPreco() > 2000)
//			.forEach(System.out::println);
//		
//		clientes.stream()
//			.map(cliente -> cliente.nome)
//			.forEach(System.out::println);
//		
//		compras.stream()
//			.map(compra -> compra.produto)
//			.map(prod -> prod.getPreco())
//			.reduce((total, atual) -> atual + total)
//			.ifPresent(System.out::println);
//		
//		compras.stream()
//			.filter(compra -> compra.cliente.nome.equals("Wesley"))
//			.map(compra -> compra.produto.getPreco())
//			.reduce((total, atual) -> total + atual)
//			.ifPresent(System.out::println);
		
		Comparator<Produto> preco = produto -> {
			if(produto)
		}
		
		System.out.println(produtos.stream().noneMatch(prod -> prod.getPreco() > 1500));
		
	}
}
