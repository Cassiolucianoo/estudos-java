package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add ->adicionam elementos na fila
		//diferenca é o comportamento quando a fila está cheia!
		fila.add("Cassio");//retorna false
		fila.offer("Zé"); // lança uma exceção
		fila.add("Guiga");
		fila.offer("Renato");
		fila.add("Nadia");
		fila.offer("Piris");
		
		//peek e Element --> obter o proximo elemento da fila sem remover adicionam elementos na fila
		//diferente é o comportamento ocorre
		//quando a fila está vazia!
		
		System.out.println(fila.peek());// returna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma execeção
		System.out.println(fila.element());
		
		//poll e Remove -> obter o proximo elemento 
		//da fila e remove!
		
		//Diferença é o comportamento ocorre
		//quando a fila está vazia!
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lança uma exceção
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
