package fundamentos;

public class ExercicioLogico {

	public static void main(String[] args) {

		boolean trabalhoTerça = true;
		boolean trabalhoQuinta = false;
		
		
		System.out.println("Trabalho na terça ? "+trabalhoTerça+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerça )+" = Então pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTerça = false;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na terça ? "+trabalhoTerça+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerça )+" = Então pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTerça = true;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na terça ? "+trabalhoTerça+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerça )+" = Então pode comprar a TV de 52 polegadas");
		
		
		trabalhoTerça = false;
		trabalhoQuinta = false;
		boolean Sorte = false;
		
		System.out.println("\nTrabalho na terça ? "+trabalhoTerça+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerça && Sorte)+" = Então sem tv \nVai ficar tranquilo economiza grana");
		
		
	}

}
