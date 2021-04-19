package oo.composicao.defasio2021;

public class ClienteMain {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.adicionarItem("lapis", 9.65,100);
		compra1.adicionarItem(new Produto ("notebook",1998.88),2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 50,100);
		compra2.adicionarItem(new Produto ("notebook",1998.88),2);
		
		Cliente cliente = new Cliente ("Cassio luciano da silva");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());

	}

}
