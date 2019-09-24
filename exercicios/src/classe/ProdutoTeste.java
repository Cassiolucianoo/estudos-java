package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.98, 0.2);

		Produto p2 = new Produto();
		
		p2.nome = "monito";
		Produto.desconto = 0.9;
		p2.preco = 900;
		
		System.out.printf("O desconto do : %s \nValor: %.2f. \nDesconto : %.2f."
				,p1.nome ,p1.preco,p1.precoComDesconto(p1.preco));
		System.out.println("\npreço com deesconto "+p1.precoComDesconto());
		
		System.out.printf("\n \nO desconto do : %s \nValor: %.2f. \nDesconto : %.2f."
				,p2.nome ,p2.preco,p2.precoComDesconto(p2.preco ));
		System.out.println("\npreço com deesconto "+p2.precoComDesconto(0.1));
		
		

	}

}
