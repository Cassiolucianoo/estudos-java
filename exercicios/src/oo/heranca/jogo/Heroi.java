package oo.heranca.jogo;

public class Heroi extends Jogador{
public Heroi() {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}
public Heroi(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

@Override
public boolean atacar(Jogador oponente) {
	
	boolean ataque1 = super.atacar(oponente);
	boolean ataque2 = super.atacar(oponente);
	boolean ataque3 = super.atacar(oponente);
	return ataque1 || ataque2 || ataque3;
	}

}
