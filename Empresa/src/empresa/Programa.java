package empresa;

public class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Jo�o da Silva", 2500);
		Gerente g1 = new Gerente(new Funcionario("Jos� Santos", 2500), 0.10);
		
		f1.setSalario(2000);
		System.out.println("O salario �: " + f1.getSalario());
		
		System.out.println("O salario do gerente �: " + g1.getSalario());
	}
}
