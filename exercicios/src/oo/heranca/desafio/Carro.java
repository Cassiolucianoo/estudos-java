package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	public int delta;

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void freia() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		velocidadeAtual = 0;
	}

	public void acelerar() {

		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}

}
