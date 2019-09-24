package desafioFinalDoModulo;

public class Comida {
	String nomeComida;
	double pesoComida;
	
	Comida(){
		this("",0);
	}
	
	public Comida(String nomeComida, double pesoComida) {
		this.nomeComida = nomeComida;
		this.pesoComida = pesoComida;
		
		
	}

	String NomeComida(String nomeComida) {
		this.nomeComida = nomeComida;
		return this.nomeComida;
	
	}
	
	double PesoComida (double pesoComida) {
		this.pesoComida = pesoComida;
		return this.pesoComida;
	}
	
	

}
