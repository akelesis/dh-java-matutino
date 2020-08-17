package empresa;

public class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João da Silva", 2500);
		Gerente g1 = new Gerente(new Funcionario("José Santos", 2500), 0.10);
		
		f1.setSalario(2000);
		System.out.println("O salario é: " + f1.getSalario());
		
		System.out.println("O salario do gerente é: " + g1.getSalario());
	}
}
