package estruturasDeControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" digite a nota");
		double nota = entrada.nextDouble();
		entrada.close();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inalida!");

		} else if (nota >= 8.1) {
			System.out.println("Conceito A!");
			System.out.println("parabéns!!!!");
		} else if (nota >= 6.1) {
			System.out.println("Conceito b!");

		} else if (nota >= 4.1) {
			System.out.println("Conceito c!");

		} else if (nota >= 2.1) {
			System.out.println("Conceito d!");
		} else {
			System.out.println("Conceito e!");
		}
		System.out.println("Fim!");
		entrada.close();

	}

}
