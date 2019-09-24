package exercicios;

public class For1 {

	public static void main(String[] args) {
		/*int contador = 0;

		while (contador <= 10) {
			// System.out.printf("i = %d\n", contador);
			int contador1 = 1;
			while (contador1 <= 10) {
				int resp = contador * contador1;
				System.out.println(contador + " X " + contador1 + " = " + resp);
				contador1 += 1;
			}
			contador += 1;
		}*/
		
		for( int contador = 1; contador <= 10; contador++){
			for( int contador1 = 1; contador <= 10; contador++){
			 
			int result = contador1 * contador;
			
			System.out.println( contador1 +"x" +contador+" = "+result);
			}	
			
		}

	}
}

