package oo.heranca.desafioInterface2021;

public class Corsa2021 extends Carro implements LigarCarro {

	public Corsa2021() {
		modelo = "Corsa modelo 2021";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		combustivel = 200;
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}

	@Override
	public void girarChaveLigar() {
		super.ligado();
	}

	@Override
	public void girarChaveDesligar() {
		super.desligado();

	}

}
