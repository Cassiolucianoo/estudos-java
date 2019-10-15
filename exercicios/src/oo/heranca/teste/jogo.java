package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Mostro;

public class jogo {

	public static void main(String[] args) {
		
		Mostro mostro = new Mostro ();
		// se alterar a distancia entre os x e y 
		//os jogadores não podem se atacar
		mostro.x = 10;
		mostro.y = 10;
		
		Heroi heroi = new Heroi ();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println(mostro.vida);
		System.out.println(heroi.vida);
		
		mostro.atacar(heroi);
		mostro.atacar(mostro);
		
		mostro.andar(Direcao.NORTE);	
		mostro.atacar(heroi);
		mostro.atacar(mostro);
		
		
		mostro.atacar(heroi);
		mostro.atacar(mostro);
		
		System.out.println("Mostro tem ====>"+mostro.vida);
		System.out.println("Heroi tem ====>"+heroi.vida);
		
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.SUL);
		//j1.andar(Direcao.OESTE);
		//j1.andar(Direcao.LESTE);
		
		
		System.out.println(mostro.y);
		
		

	}

}
