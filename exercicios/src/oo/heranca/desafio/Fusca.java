package oo.heranca.desafio;

public class Fusca extends Carro{
	public Fusca() {
		super(10);
		
	}
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta =  350;
		setDelta(350);
	}

}
