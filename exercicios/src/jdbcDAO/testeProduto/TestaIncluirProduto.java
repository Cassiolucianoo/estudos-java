package jdbcDAO.testeProduto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbcDAO.ConnectionFactory;
import jdbcDAO.dao.ProdutoDAO;
import jdbcDAO.model.Produto;

public class TestaIncluirProduto {

	
	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Notebook Asus", "Rog Zephyrus I7 16gb 512gb Ssd Rtx2080 15,6''");
		Produto comoda1 = new Produto("Bateria", "5000mah Para Notebook Asus X556ur Xx478t");
		Produto comoda2 = new Produto("Guarda-Roupa ", "Closet Modulado Barcelona Demolição");
		Produto comoda4 = new Produto("Guarda Roupa Casal", "Casal 3 Portas 6 Gavetas Nápoli Espresso Móveis Freijó ");
		Produto comoda5 = new Produto("Lava-Louças Brastemp", "Ative! BLF08 AS - 8 Serviços");
		Produto comoda6 = new Produto("Micro-ondas Consul ", "CMS45 ARANA");

		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.Salvar(comoda);
			produtoDao.Salvar(comoda1);
			produtoDao.Salvar(comoda2);
			produtoDao.Salvar(comoda4);
			produtoDao.Salvar(comoda5);
			produtoDao.Salvar(comoda6);

			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}

	}

}
