package oo.heranca.desafio2021;

public class Carro {
	protected int velocidadeAtual;
	protected  String estadoCarro;
    protected double combustivel = 100.0;
    protected String modelo;
	
    Carro (){
		
	}

	public void acelerar() {
		if (this.estadoCarro == "Ligado") {
			this.combustivel -= 1.00;
			this.velocidadeAtual += 5;
		} else {
			this.estadoCarro = "Desligado";
		}
	}

	void freiar() {
		if (this.velocidadeAtual == 0) {
			desligado();
			this.estadoCarro = "Seu carro está parado e morreu! Ligue ele novamente";
		} else {
			this.combustivel -= 1.00;
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
		return this.modelo+" Velocidade atual é " + this.velocidadeAtual + "Km/h."+ this.estadoCarro+" Gastos em litros = "+this.combustivel;
	}

}
