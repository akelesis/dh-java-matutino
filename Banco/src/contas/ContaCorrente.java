package contas;

public class ContaCorrente extends Conta {
	private double chequeEspecial;
	
	public ContaCorrente(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if(getSaldo() >= valor) {
			super.setSaldo(super.getSaldo() - valor);
		}
		else if(super.getSaldo() > 0 && this.chequeEspecial >= (valor - super.getSaldo())) {
			this.chequeEspecial -= (valor - super.getSaldo());
			super.setSaldo(super.getSaldo());
		}
		else if(this.chequeEspecial >= valor){
			this.chequeEspecial -= valor;
		}
	}
	
	public String getSaldoComCheque() {
		return super.getSaldo() + " " + this.chequeEspecial;
	}
}
