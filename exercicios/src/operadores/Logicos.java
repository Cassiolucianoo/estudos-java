package operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		
		
		System.out.println("\ntabela verdade E (and )");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false  && true);
		//System.out.println(false && false);
		
		
		
		System.out.println("\ntabela verdade ou exclusivo  (our )");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false  ||  true);
		System.out.println(false ||  false);
		
		
		System.out.println("\ntabela verdade ou exclusivo  (xor )");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^  true);
		System.out.println(false  ^  false);
		
		
		System.out.println("\ntabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
	

	}

}
