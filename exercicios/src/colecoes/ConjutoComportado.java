package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjutoComportado {

	public static void main(String[] args) {
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Claudia");
		listaAprovados.add("Zé");
		listaAprovados.add("Aninha");
		listaAprovados.add("Claudia");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(5);
		nums.add(7);
		nums.add(8);
		nums.add(3);
		nums.add(1);
		
		for(int n: nums) {
			System.out.println(n);
		}
		
	}

}
