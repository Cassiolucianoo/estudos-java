package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(f - 32) * 5/9 = c
		double fator = 5.0 / 9.0;
		double ajuste = 32;
		double fahrenheit = 86;
		double c = (fahrenheit - ajuste)*fator;
		System.out.println(" O valor graus °C =  " + c );
		
		
		fahrenheit = 150;
		c = (fahrenheit - ajuste)*fator;
		System.out.println(" O valor graus °C =  " + c );
		
		
	}

}
