package oo.heranca.desafio;

public class HondaCivic extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public HondaCivic() {
		super(315);
	}

	public HondaCivic(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);

	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;

	}

	@Override
	public void ligarAr() {
		ligarAr = true;

	}

	@Override
	public void desligaAr() {
		ligarAr = false;

	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}

	}

	// @Override
	// void acelerar() {

	// velocidadeAtual +=20;
	// }
}
