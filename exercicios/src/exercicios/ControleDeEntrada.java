package exercicios;

import javax.swing.JOptionPane;

public class ControleDeEntrada {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano com 4 digitos"));
		
		
		
		String s = Integer.toString(numero);
		System.out.println(s.length());
		
		if(s.length() == 4){
			
			JOptionPane.showMessageDialog(null, "O ano digitado é valido"+numero);
				
			 	if(numero%4 ==0){
			 		
			 		JOptionPane.showMessageDialog(null, "O ano é bisexto");
			 		
			 	}else {
			 		
			 		JOptionPane.showMessageDialog(null, "O ano não é bisexto");
			 		
			 	}

		}else {
			JOptionPane.showMessageDialog(null, "O ano digitado está invalido");
		}
		
	}
	

}
