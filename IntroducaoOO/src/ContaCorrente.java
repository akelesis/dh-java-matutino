
public class ContaCorrente extends Conta {
	double chequeEspecial = 200;
	double pacoteDeServicos;
	
	public ContaCorrente() {
		super();
	}
	
	public void viraMes() {
		saldo -= this.pacoteDeServicos;
	}
	
	public void sacar(double valor) {
		if(saldo <= 0 && chequeEspecial < valor) {
			System.out.println("Saldo insuficiente");
		}
		else if(saldo <= 0 && chequeEspecial >= valor) {
			chequeEspecial -= valor;
		}
		else {
			saldo -= valor;
		}
	}
	
	public void imprimirSaldo() {
		super.imprimirSaldo();
		System.out.println("Seu cheque especial é de R$" + chequeEspecial);
	}
}
