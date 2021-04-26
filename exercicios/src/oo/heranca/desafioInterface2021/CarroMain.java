package oo.heranca.desafioInterface2021;

public class CarroMain {

	public static void main(String[] args) {
	
		Corsa2021 novoCorsa = new Corsa2021();
		
		novoCorsa.girarChaveLigar();
		
		System.out.println(novoCorsa); //Carro ligado porem não em movimento
		
		novoCorsa.acelerar();
		System.out.println(novoCorsa); // 5k
		
		novoCorsa.freiar();
		novoCorsa.freiar();
		novoCorsa.freiar();
		novoCorsa.freiar();
		
		novoCorsa.girarChaveDesligar();
		System.out.println(novoCorsa);
		
		System.out.println("------------------------------------------------------------------------------------------\n");
		
		Gol g5 = new Gol();
		
		g5.acelerar();
		System.out.println(g5);
		
		g5.ligado();
		System.out.println(g5);
		
		g5.acelerar();
		System.out.println(g5);
		
		g5.acelerar();
		System.out.println(g5);
		
		g5.freiar();
		System.out.println(g5);
		
		g5.freiar();
		System.out.println(g5);
		
		g5.freiar();
		System.out.println(g5);
		
		g5.freiar();
		System.out.println(g5);
		
		g5.freiar();
		System.out.println(g5);
		
		
	
		
	}

}
