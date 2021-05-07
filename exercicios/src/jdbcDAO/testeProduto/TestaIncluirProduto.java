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
		Produto comoda2 = new Produto("Notebook Lenovo  ", "Ultrafino ideapad S145 i3-1005G1, 4GB 1TB Windows 10 15.6\", Prata");

		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.Salvar(comoda);
			produtoDao.Salvar(comoda1);
			produtoDao.Salvar(comoda2);
			
		 List<Produto> listaDeProdutos = produtoDao.listar();
		 listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		
	}

}
