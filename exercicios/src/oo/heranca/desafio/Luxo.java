package oo.heranca.desafio;

public interface Luxo {
	public void ligarAr();
	abstract void desligaAr();
	
	default int velocidadeDoar() {
		return 1;
	}
}
