package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Joap Peido";
		
		c1.adicionarItem("Caderno", 5, 60.30);
		
		c1.adicionarItem(new Item("Caneta", 10, 10.50));
		c1.adicionarItem(new Item("Borracha", 12, 20.99));
		c1.itens.add(new Item("Caderno", 5, 60.30));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		//só pra mostrar a relação bidirecional
		double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é "+ total);
	}

}
