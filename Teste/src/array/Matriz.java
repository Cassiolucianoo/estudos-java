package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade alunos ?");
		int qtAlunos = entrada.nextInt();
		
		System.out.println("Quantidade de notas por aluno ?");
		int qtNotass = entrada.nextInt();
		
		double total = 0;
		double [][] notasDaturma = new double [qtAlunos][qtNotass];
		
		for (int a = 0; a < notasDaturma.length; a++) {
			for (int n = 0; n < notasDaturma.length; n++) {
				System.out.printf
				("Informe a nota %d do aluno %d :", n, a);
				notasDaturma[a][n] = entrada.nextDouble();
				total +=notasDaturma[a][n];
			}
		}
		
		double  media = total / (qtAlunos * qtNotass);
		System.out.println("Media da turma é "+media);
		
		for (double [] notasDoAluno: notasDaturma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		entrada.close();
	}

}
