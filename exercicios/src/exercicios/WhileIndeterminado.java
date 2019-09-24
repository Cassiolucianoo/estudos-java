package exercicios;

import javax.swing.JOptionPane;

public class WhileIndeterminado {

	public static void main(String[] args) {
		String mensagem = "Fim";

		while (mensagem.equals("Fim")) {
			
			mensagem = JOptionPane.showInputDialog("Digite SAIR");
			
			System.out.println("Sair");
			
		}
		
	}

}
