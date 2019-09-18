package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4); //maior
		System.out.println(3 >= 3); //maio ou igual
		System.out.println(3 < 7); //menor
		System.out.println(30 <= 7); //menou ou igual
		System.out.println(30 != 4); //diferente 
		
		double nota = 9.9;
		boolean BomComportamento = false;
		boolean passouPorMedia = nota >= 7 ;
		boolean temDesconto = BomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto "+ temDesconto);
		

	}

}
