package oo.desafioHeranca;

public class Carro {
	double velocidadeAtual;
	
	void freia(){
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
			velocidadeAtual = 0;
	}
	void acelerar(){
		
		this.velocidadeAtual += 5;
	}
	
	public String  toString() {
		return"Velocidade atual é "+velocidadeAtual+"Km/h.";
	}

}
