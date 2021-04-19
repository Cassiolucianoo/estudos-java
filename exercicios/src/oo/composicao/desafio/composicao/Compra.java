package oo.composicao.desafio.composicao;

import java.util.ArrayList;
import java.util.List;


public class Compra {
	List<Item>items = new ArrayList<>();
	
	
	void adicionarItem(int quantiProduto,  Produto produto) {
		this.adicionarItem(new Item( quantiProduto
		,produto ));
	}
	
	void adicionarItem(Item item) {
		this.items.add(item);
	
	}
	
}

