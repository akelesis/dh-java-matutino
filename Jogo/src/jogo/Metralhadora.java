package jogo;

public class Metralhadora implements Arma{
	private int municao = 35;
	private int relogio = 0;
	
	public int getMunicao() {
		return municao;
	}
	
	@Override
	public int getRelogio() {
		return relogio;
	}

	@Override
	public void atirar() {
		if(municao > 0) {
			System.out.println("tra tra tra tra tra");
			this.municao -= 5;
		}
		else {
			System.out.println("Sem munição");
		}
		
	}

	@Override
	public void recarregar() {
		System.out.println("Recarregando");
		this.municao = 35;
		this.relogio += 5;
	}
	
}
