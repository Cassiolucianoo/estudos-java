package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto ("Caneta", 12.34 , 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2988.99, 0.25);
		Produto p3 = new Produto("caneca", 12.80, 0.05);
		Produto p4 = new Produto("Impressora", 60, 0.18);
		Produto p5 = new Produto("TV - LCD", 9800, 0.30);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.print(p.preco));
		produtos.forEach(System.out::println);
		
		
	}

}
