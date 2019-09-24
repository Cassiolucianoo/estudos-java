package exercicios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro Salario do Mes : \n");
		String salario1 = entrada.nextLine().replace( "," , "." );
		
		System.out.println("Digite o Segundo Salario do Mes: \n");
		String salario2 = entrada.nextLine().replaceAll( "," , "." );
		
		System.out.println("Digite o Terceiro Salario do Mes: \n");
		String salario3 = entrada.next().replaceAll( "," , "." );;
		

		double pagamento1 = Double.parseDouble(salario1); 
	
		double pagamento2 = Double.parseDouble(salario2); 
		
		double pagamento3 = Double.parseDouble(salario3); 
		
		double  media = (pagamento1 + pagamento2 + pagamento3) / 3;
		
		System.out.println("Media Salarial =  "+media);
		entrada.close();
	}

}
