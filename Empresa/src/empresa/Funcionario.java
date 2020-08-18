package empresa;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public final double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= this.salario) {
			this.salario = salario;	
		}
	}
	
}
