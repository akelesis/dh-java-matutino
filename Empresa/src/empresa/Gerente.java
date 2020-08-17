package empresa;

public class Gerente extends Funcionario{
	private double bonificacao;
	
	public Gerente() {}
	
	public Gerente(Funcionario func, double bonificacao) {
		super(func.getNome(), func.getSalario());
		this.bonificacao = bonificacao;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * bonificacao);
	}
	
	
}
