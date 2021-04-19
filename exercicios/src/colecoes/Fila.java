package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add ->adicionam elementos na fila
		//diferenca � o comportamento quando a fila est� cheia!
		fila.add("Cassio");//retorna false
		fila.offer("Z�"); // lan�a uma exce��o
		fila.add("Guiga");
		fila.offer("Renato");
		fila.add("Nadia");
		fila.offer("Piris");
		
		//peek e Element --> obter o proximo elemento da fila sem remover adicionam elementos na fila
		//diferente � o comportamento ocorre
		//quando a fila est� vazia!
		
		System.out.println(fila.peek());// returna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lan�a uma exece��o
		System.out.println(fila.element());
		
		//poll e Remove -> obter o proximo elemento 
		//da fila e remove!
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmprty();
		//fila.contains......
		
	}

}
