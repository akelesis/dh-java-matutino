package jogo;

public class Programa {
	public static void main(String[] args) {
		Jogador player = new Jogador();
		
		player.setArma(new Pistola());
		player.getArma().atirar();
		player.getArma().atirar();
		player.getArma().atirar();
		player.getArma().atirar();
		player.getArma().atirar();
		player.getArma().recarregar();
		player.getArma().recarregar();
		player.getArma().recarregar();
		player.getArma().recarregar();
		player.getArma().recarregar();
		player.getArma().atirar();
		player.getArma().atirar();
		player.getArma().atirar();
		
		
		Pistola p1 = (Pistola) player.getArma();
		
		System.out.println(p1.getMunicao());
		p1.setMunicao(35);
		System.out.println(player.getArma().getMunicao());
		System.out.println(player.getArma().getRelogio());
	}
}
