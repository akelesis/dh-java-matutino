package lanches;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in); 
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Selecione o tipo de lanche:");
		System.out.println("[1] sanduiches   [2] bolos");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
		}
		else if(opcao == 2) {
			lanche = new Bolo();
			menuBolo((Bolo) lanche);
		}
		
		System.out.println("Obrigado pela preferencia!");
	}
	
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i = 0;
		int distancia;
		
		System.out.println("Você escolheu a opção sanduíche");
		System.out.println("Escolha os ingredientes (digite 0 para finalizar a escolha)");
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua distância em km: ");
		distancia = teclado.nextInt();
		System.out.println("O seu pedido chegará em: " + lanche.calculaTempo(distancia) + " minutos");
		
	}
	
	public static void menuBolo(Bolo lanche) {
		
	}
}
