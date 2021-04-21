package estruturasDeControle;

public class WhileDeterminado {

	public static void main(String[] args) {
		int contador = 0;

		while (contador <= 10) {
			// System.out.printf("i = %d\n", contador);
			int contador1 = 1;
			while (contador1 <= 10) {
				int resp = contador * contador1;
				System.out.println(contador + " X " + contador1 + " = " + resp);
				contador1 += 1;
			}
			contador += 1;
		}
	}

}
