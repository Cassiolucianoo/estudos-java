package oo.desafioHeranca;

public class TesteCarro {

	public static void main(String[] args) {
		Carro civic = new HondaCivic ();
		
		civic.acelerar();

		Carro fusca = new Fusca ();
		
		fusca.acelerar();
		//fusca.freia();
		
		System.out.println(fusca);
		System.out.println(civic);
		

	}

}
