package fundamentos;

public class ExercicioLogico {

	public static void main(String[] args) {

		boolean trabalhoTer�a = true;
		boolean trabalhoQuinta = false;
		
		
		System.out.println("Trabalho na ter�a ? "+trabalhoTer�a+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTer�a )+" = Ent�o pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTer�a = false;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTer�a+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTer�a )+" = Ent�o pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTer�a = true;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTer�a+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTer�a )+" = Ent�o pode comprar a TV de 52 polegadas");
		
		
		trabalhoTer�a = false;
		trabalhoQuinta = false;
		boolean Sorte = false;
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTer�a+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTer�a && Sorte)+" = Ent�o sem tv \nVai ficar tranquilo economiza grana");
		
		
	}

}
