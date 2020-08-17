
public class Poupanca extends Conta {
	double rendimento;
	
	
	public Poupanca() {
		super();
	}
	
	public void viraMes() {
		saldo += (saldo * rendimento);
	}
	
	public void imprimirSaldo() {
		System.out.println("Seu saldo na poupanca é de: R$" + saldo);
	}
}
