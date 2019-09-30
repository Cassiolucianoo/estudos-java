package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Principe");
		livros.add("Don Quixote");
		livros.add("o Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		for (String livro : livros) {
			System.out.println(" Sequencia de pilha >>>>>" + livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		

	}

}
