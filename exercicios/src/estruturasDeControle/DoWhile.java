package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String texto = "por favor";
		do{
			System.out.println("fale a palavra magivca !!");
			System.out.println("Quer sair?");
			texto = entrada.next();
			
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
		

	}

}
