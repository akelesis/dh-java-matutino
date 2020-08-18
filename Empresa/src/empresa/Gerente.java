package empresa;

public class Gerente extends Administrativa{
	private final double bonificacao = .12;
	
	public Gerente() {}
	
	public Gerente(Funcionario func, double bonificacao) {
		super();
	}

	public double getBonificacao() {
		return bonificacao;
	}
	
	public double getSalarioComBonificacao() {
		return super.getSalario() + (super.getSalario() * bonificacao);
	}
	
	public void demitir(Funcionario func) {
		
	}
}
