package exercicios;

import javax.swing.JOptionPane;

public class WhileIndeterminadoCorrecao {

	public static void main(String[] args) {
		String mensagem = "";

		while (!mensagem.equalsIgnoreCase("sair")) {
			
			mensagem = JOptionPane.showInputDialog("Se voc� dizer sair, sai !");
			
			
		}

	}

}
