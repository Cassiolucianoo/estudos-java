package fundamentos;

public class AreaCircuferencia {

	public static void main(String[] args) {
		// criando variaveis, atribuindo e calculando
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		//outro calculo concatenando java
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = "+ area +"m2");
		
		
	}

}
