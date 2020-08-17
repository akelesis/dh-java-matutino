
public class Conta {
	String titular;
	String agencia;
	String numeroConta;
	double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;			
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void imprimirSaldo() {
		System.out.println("O seu saldo é: " + saldo);
	}
}
