package desafioFinalDoModulo;

public class Pessoa {
	String pessoa;
	double peso;
	Comida comida = new Comida();

	Pessoa() {

		this("sem nome", 0);
	}

	public Pessoa(String pessoa, double peso) {
		this.pessoa = pessoa;
		this.peso = peso;
	}
	

	
	public double seAlimentar(double ganhaPeso) {
		this.peso = this.peso + ganhaPeso;
		return this.peso;
	}
}
