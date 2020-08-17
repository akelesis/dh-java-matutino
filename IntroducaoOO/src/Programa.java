public class Programa {
	public static void main(String[] args) {
		Conta ccTeste = new ContaCorrente();
		
		ccTeste.depositar(200);
		ccTeste.imprimirSaldo();
		ccTeste.sacar(200);
		ccTeste.sacar(200);
		ccTeste.imprimirSaldo();
		
	}
}
