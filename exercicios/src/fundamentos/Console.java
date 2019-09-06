package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!\n\n");
		
		System.out.printf("Megasena %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n","jão");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.next();
		

		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = entrada.next();
		
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Seu nome : "+nome+" "+sobreNome+
				" Você tem "+idade+" anos");
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobreNome, idade);
		entrada.close();
	}

}
