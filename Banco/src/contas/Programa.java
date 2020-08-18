package contas;

public class Programa {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(1000);
		
		conta.depositar(300);
		conta.sacar(500);
		
		System.out.println(conta.getSaldoComCheque());
	}
}
