package oo.heranca.desafio2021;

public class carroMain {

	public static void main(String[] args) {
	
		Corsa2021 novoCorsa = new Corsa2021();
		
		novoCorsa.acelerar();
		System.out.println(novoCorsa); //Carro  Desligado
		
		novoCorsa.ligado();
		System.out.println(novoCorsa); //Carro ligado porem não em movimento
		
		novoCorsa.acelerar();
		System.out.println(novoCorsa); // 5k
		
		novoCorsa.acelerar();
		System.out.println(novoCorsa); // 10k
		
		novoCorsa.acelerar();
		System.out.println(novoCorsa);// 15k
		
		novoCorsa.freiar();
		System.out.println(novoCorsa);
		
		novoCorsa.freiar();
		System.out.println(novoCorsa);
		
		novoCorsa.freiar();
		System.out.println(novoCorsa);
		
		novoCorsa.freiar();
		System.out.println(novoCorsa);
		
		
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
