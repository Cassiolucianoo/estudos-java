package estruturasDeControle;

import java.util.Scanner;

public class CorecaoDesafioSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println(" Digite a semana");
		String dia = entrada.next();
		entrada.close();

		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		} else if ("ter�a".equalsIgnoreCase(dia)||
				   "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2); 
		}  else if ("sabado".equalsIgnoreCase(dia)|| 
				    "s�bado".equalsIgnoreCase(dia)) {
					System.out.println(6); 
		} else {
			System.out.println("Dia invalido");
		}
		System.out.println("Fim!");
		entrada.close();


	}

}
