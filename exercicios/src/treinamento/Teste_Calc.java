package treinamento;

import javax.swing.JOptionPane;

public class Teste_Calc {

	public static void main(String[] args) {
		
		Calcular calcular = new Calcular();
		
		int opao = Integer.parseInt(JOptionPane.showInputDialog("Informe uma das informa��es :\n 1 - Soma \n 2 - subtra��o \n 3 - Multiplica��o \n 4 - para divis�o  "));
		int pnumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		int snumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		
		calcular.setOpcao(opao);
		calcular.calcula(pnumero,snumero);
		
		JOptionPane.showMessageDialog(null,calcular.getResultado());

	}

}
