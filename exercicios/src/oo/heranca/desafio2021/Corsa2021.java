package oo.heranca.desafio2021;

public class Corsa2021 extends Carro {
	
	void acelerar() {
		if (this.estadoCarro == "Ligado") {
			this.velocidadeAtual += 15;
		} else {
			estadoCarro = "Desligado";
		}
	}
}



