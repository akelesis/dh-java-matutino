package contas;

public abstract class Conta {
	private String cliente;
	private String numeroConta;
	private String agencia;
	private double saldo;
	

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public abstract void sacar(double valor);
	
	
}
