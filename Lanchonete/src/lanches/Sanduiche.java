package lanches;

public class Sanduiche extends Lanche {
	private String[] ingredientes = new String[10];
	private final int tempoPadrao = 15;

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}
	
	
}
