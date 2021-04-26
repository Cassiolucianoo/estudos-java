package oo.polimorfismo;

public class Comida {
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
		this.peso = peso;
		}
	}
	
	/*
	 * public void comer (Arroz arroz) { this.peso += arroz.getPeso(); } public void
	 * comer (Sorvete sorvete) { this.peso += sorvete.getPeso(); } public void comer
	 * (Feijao feijao) { this.peso += feijao.getPeso(); }
	 */
}
