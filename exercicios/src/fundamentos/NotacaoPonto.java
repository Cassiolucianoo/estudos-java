package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Cara ");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Oxi ".toUpperCase();
		System.out.print(x);
		
		String y = "Bom dia X"
				.replace("X", "Cassio")
				.toUpperCase()
				.concat("!!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador"."

	}

}
