package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiasSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println(" Digite a semana");
		String dia = entrada.next();
		entrada.close();

		if ("Domingo" == dia) {
			System.out.println(1);

		} else if ("Quarta" == dia) {
			System.out.println(4);
		
		} else if ("Quinta" == dia)  {
			System.out.println(5);

		} else if ("Terça" == dia) {
			System.out.println(3);

		} else if ("Segunda" == dia) {
			System.out.println(2); 
		} else {
			System.out.println(6);
		}
		System.out.println("Fim!");
		entrada.close();

	}

	}


