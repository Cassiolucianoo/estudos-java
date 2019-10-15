package oo.heranca;

public class Mostro extends jogador {

	
	public Mostro() {
		this(0, 0);
		
	}
	
	public Mostro(int x, int y) {
		super(x, y);
		
	}

	public boolean atacar(jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 5;
			return true;
		}else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 5;
			return true;
		}else {
			return true;
		}
		
		
	}
}
