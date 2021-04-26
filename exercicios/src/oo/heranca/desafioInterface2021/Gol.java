package oo.heranca.desafioInterface2021;

public class Gol extends Carro {
	
	public Gol() {
		modelo = "Gol g5";
		
	}
	@Override
	public void acelerar() {
		
		if (this.estadoCarro == "Ligado") {
			this.combustivel -= 5.00;
			this.velocidadeAtual += 10;
		} else {
			this.estadoCarro = "Desligado";
		}	 
			}

}
