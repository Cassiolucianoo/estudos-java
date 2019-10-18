package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		
		
		Calculo calculo = (x,y) -> { return x + y;};
		//Calculo calculo = new Somar ();
		System.out.println(calculo.executar(3, 2));
		
		calculo = (x, y)-> x * y;
		System.out.println(calculo.executar(3, 2));
		
		///calculo = new Multiplicar ();
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
	}

}
