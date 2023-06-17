package fundamentos;

public class ExercicioLogico {

	public static void main(String[] args) {

		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		
		System.out.println("Trabalho na ter�a ? "+trabalhoTerca+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerca )+" = Ent�o pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTerca = false;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTerca+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerca )+" = Ent�o pode comprar a TV de 32 polegadas \ne vamos tomar sorvete");
		
		trabalhoTerca = true;
		trabalhoQuinta = true;
		
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTerca+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerca )+" = Ent�o pode comprar a TV de 52 polegadas");
		
		
		trabalhoTerca = false;
		trabalhoQuinta = false;
		boolean Sorte = false;
		
		System.out.println("\nTrabalho na ter�a ? "+trabalhoTerca+ " e na quinta ?"+trabalhoQuinta);
		System.out.println((trabalhoQuinta && trabalhoTerca && Sorte)+" = Ent�o sem tv \nVai ficar tranquilo economiza grana");
		
		
	}

}
