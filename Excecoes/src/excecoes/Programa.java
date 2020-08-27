package excecoes;

import java.io.IOException;

public class Programa {
	public static void main(String[] args) {
		Produto prod = new Produto();
		Verificadora verifica = new Verificadora();
		
		try {
			verifica.verificaProduto(prod);
		}
		catch(NullPointerException e) {
			System.out.println("Produto é null");
		}
		catch(EmptyStringException e) {
			System.out.println(e.getMessage());
		}
		
//		verifica.ExcecaoRunTime();
		
		try {
			int divisao = 8/0;		
			System.out.println(divisao);
		}
		catch(ArithmeticException e) {
			double divisaoDouble = 8.0/0.0;
			System.out.println(divisaoDouble);
			e.getMessage();
		}
		
		try {
			verifica.notRuntime();
		} catch (IOException e) {
			System.out.println("Houve uma falha na escrita do arquivo");
		} catch(RuntimeException e) {
			System.out.println("Houve um erro de aritmetica");
		}
		
		
		System.out.println("Parabéns, você chegou ao final do programa");
	}
}
