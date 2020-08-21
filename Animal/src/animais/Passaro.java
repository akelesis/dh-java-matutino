package animais;

public class Passaro implements Animal{
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void mover() {
		System.out.println(nome + " est� voando");
		
	}

	@Override
	public void comer() {
		System.out.println(nome + " est� comendo alpiste");
		
	}

}
