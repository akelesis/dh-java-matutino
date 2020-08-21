package jogo;

public class Pistola implements Arma{
	private int municao = 5;
	private int relogio = 0;
	
	public int getMunicao() {
		return municao;
	}
	
	public void setMunicao(int municao) {
		this.municao = municao;
	}
	
	public int getRelogio() {
		return relogio;
	}
	
	@Override
	public void atirar() {
		if(municao > 0) {
			System.out.println("pou!");
			this.municao -= 1;
		}
		else {
			System.out.println("Sem munição");
		}
		
	}

	@Override
	public void recarregar() {
		System.out.println("Recarregando");
		this.municao = 15;
		this.relogio += 2; 
	}
}
