package array;

import javax.swing.JOptionPane;

public class DesafioArray {

	public static void main(String[] args) {
		int i = 0;
		double totalAluno = 0;
		i = Integer.parseInt(JOptionPane.showInputDialog
				("Informe a quantidade de nota a ser lansadas"));
		double[] notasAluno = new double[i];

		for (i = 0; i < notasAluno.length; i++) {
			notasAluno[i] = Double.parseDouble
					(JOptionPane.showInputDialog("Informe a priemra nota"));
			totalAluno += notasAluno[i];
		}

		for (double notas : notasAluno) {

			System.out.println(" nota " +notas);
			//System.out.println(notasAluno[notasAluno.length - 1]);
		}
		double media = totalAluno / notasAluno.length;
		System.out.println("total de media "+media);
	}
	

}
