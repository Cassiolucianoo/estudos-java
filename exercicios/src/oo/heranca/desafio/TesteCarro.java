package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		HondaCivic civic = new HondaCivic ();
		
		civic.acelerar();
		System.out.println(civic);

		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.ligarTurbo();
		civic.ligarTurbo();
		civic.ligarTurbo();
		System.out.println(civic);
		
		
		
		Carro fusca = new Fusca (20);
		fusca.acelerar();
		//fusca.freia();

		System.out.println(fusca);
		
		fusca.acelerar();
		//fusca.freia();

		System.out.println(fusca);
		
		//fusca.acelerar();

		System.out.println(fusca);
		
		System.out.println(civic.velocidadeDoar());
		
	}

}
