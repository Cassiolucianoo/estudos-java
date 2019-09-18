package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		produto p1 = new produto("Notebook", 4356.98, 0.2);

		produto p2 = new produto();
		
		p2.nome = "monito";
		p2.desconto = 0.9;
		p2.preco = 900;
		
		System.out.printf("O desconto do : %s \nValor: %.2f. \nDesconto : %.2f."
				,p1.nome ,p1.preco,p1.precoComDesconto(p1.preco, p1.desconto));
		
		System.out.printf("\n \nO desconto do : %s \nValor: %.2f. \nDesconto : %.2f."
				,p2.nome ,p2.preco,p2.precoComDesconto(p2.preco, p2.desconto));
		
		
		

	}

}
