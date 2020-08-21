package animais;

public class Cachorro implements Animal, Amigo {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void respirar() {
		System.out.println(nome + " está respirando oxigenio");
	}
	
	@Override
	public void mover() {
		System.out.println(nome + " está movendo-se com patas");
		
	}

	@Override
	public void comer() {
		System.out.println(nome + " está comendo ração");
		
	}
	
	public void comer(String comida) {
		System.out.println(nome + " está comendo " + comida);
	}

	@Override
	public void brincar() {
		System.out.println(nome + " está brincando de morder!");
		
	}
}
