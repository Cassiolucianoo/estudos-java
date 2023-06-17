package array;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		
		double[] notasAluno = new double [4];
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.9;
		notasAluno[3] = 9.9;
		
		System.out.println(Arrays.toString(notasAluno));
		System.out.println(notasAluno[0]);
		System.out.println(notasAluno[notasAluno.length - 1]);
		//System.out.println(notasAluno[4]); ERRO!
		
		double totalAtuno = 0 ;
		for(int i = 0; i < notasAluno.length; i++) {
			totalAtuno += notasAluno[i];
		}
		System.out.println(totalAtuno / notasAluno.length);
		
		final double notaArmazenada = 5.9;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for (int i = 0 ; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
