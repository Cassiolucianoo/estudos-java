package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Cassio");
		
		lista.add(u1);
		lista.add(new Usuario("Luciano"));
		lista.add(new Usuario("welton"));
		lista.add(new Usuario("Karina"));
		lista.add(new Usuario("Antony"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));// vai ser elimida da lista
		
		System.out.println(lista.get(3).nome);//acessa pelo indice da listya
		System.out.println("-->>>>"+lista.remove(1));
		//lista.remove(1);
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem ? "+lista.contains(new Usuario("Lia")));
		
		for(Usuario u : lista) {
			System.out.println(u.toString());
		}
		
		
		

	}

}
