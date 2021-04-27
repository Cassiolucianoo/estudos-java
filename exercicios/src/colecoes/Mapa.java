package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios =  new HashMap<>();
		
		usuarios.put(80, "Cassio");
		usuarios.put(2, "Pedro");
		usuarios.put(4, "Zé");
		usuarios.put(7, "Natalha");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Cassio"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Zé"));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (int valor : usuarios.keySet()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey()+ "====>");
			System.out.println(registro.getValue());
		}
		
		
		
	}

}
