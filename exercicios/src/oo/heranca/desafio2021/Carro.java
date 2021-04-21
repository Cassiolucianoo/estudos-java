package oo.heranca.desafio2021;

public class Carro {
	protected int velocidadeAtual;
	protected String estadoCarro;

	void acelerar() {
		if (this.estadoCarro == "Ligado") {
			this.velocidadeAtual += 5;
		} else {
			estadoCarro = "Desligado";
		}
	}

	void freiar() {
		if (this.velocidadeAtual == 0) {
			desligado();
			estadoCarro = "Seu carro está parado e morreu! Ligue ele novamente";
		} else {
			this.velocidadeAtual -= 5;
		}
	}

	void ligado() {
		this.estadoCarro = "Ligado";
	}

	void desligado() {

		this.estadoCarro = "Desligado";
	}

	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h."+ estadoCarro;
	}

}
